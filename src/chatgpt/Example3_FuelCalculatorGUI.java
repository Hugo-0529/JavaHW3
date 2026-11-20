package chatgpt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 範例3：使用 java.awt (Frame、Panel、Label、TextField、Button、Choice、TextArea)
//        與 java.awt.event (ActionListener、WindowAdapter)
// 油耗計算機：輸入里程與加油量，計算每公升可跑幾公里與油錢
public class Example3_FuelCalculatorGUI extends Frame
{
    private final TextField distanceField = new TextField("350", 10);
    private final TextField litersField = new TextField("30.5", 10);
    private final Choice fuelChoice = new Choice();
    private final Label resultLabel = new Label("請輸入資料後按「計算」", Label.CENTER);
    private final TextArea history = new TextArea(6, 40);

    private static final double[] PRICES = {29.5, 31.0, 33.0, 27.8};   // 每公升價格

    public Example3_FuelCalculatorGUI()
    {
        super("油耗計算機 (java.awt)");
        setLayout(new BorderLayout(8, 8));

        fuelChoice.add("92無鉛");
        fuelChoice.add("95無鉛");
        fuelChoice.add("98無鉛");
        fuelChoice.add("超級柴油");

        Panel input = new Panel(new GridLayout(3, 2, 6, 6));
        input.add(new Label("行駛里程 (公里)："));
        input.add(distanceField);
        input.add(new Label("加油量 (公升)："));
        input.add(litersField);
        input.add(new Label("油品："));
        input.add(fuelChoice);

        Button calcButton = new Button("計算");
        Button clearButton = new Button("清除紀錄");

        // 匿名內部類別實作 ActionListener
        calcButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calculate();
            }
        });
        // Lambda 寫法 (ActionListener 只有一個抽象方法)
        clearButton.addActionListener(e -> history.setText(""));
        // 在輸入框按 Enter 也會觸發計算
        litersField.addActionListener(e -> calculate());

        Panel buttons = new Panel();
        buttons.add(calcButton);
        buttons.add(clearButton);

        resultLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        history.setEditable(false);

        Panel top = new Panel(new BorderLayout());
        top.add(input, BorderLayout.CENTER);
        top.add(buttons, BorderLayout.SOUTH);

        add(top, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);
        add(history, BorderLayout.SOUTH);

        // 按視窗右上角 X 時關閉程式
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void calculate()
    {
        try
        {
            double distance = Double.parseDouble(distanceField.getText().trim());
            double liters = Double.parseDouble(litersField.getText().trim());
            if (distance <= 0 || liters <= 0)
                throw new NumberFormatException();

            double kmPerLiter = distance / liters;
            double cost = liters * PRICES[fuelChoice.getSelectedIndex()];

            String msg = String.format("%s：%.2f 公里/公升，油錢 %.0f 元",
                    fuelChoice.getSelectedItem(), kmPerLiter, cost);
            resultLabel.setForeground(new Color(0, 110, 0));
            resultLabel.setText(msg);
            history.append(msg + "\n");
        }
        catch (NumberFormatException ex)
        {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("請輸入大於 0 的數字！");
        }
    }

    public static void main(String[] args)
    {
        new Example3_FuelCalculatorGUI().setVisible(true);
    }
}
