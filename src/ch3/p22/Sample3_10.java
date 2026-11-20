package ch3.p22;

// CH3 P22：private 欄位 + public 方法 (在方法內加入判斷排除錯誤設定)
public class Sample3_10
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        // car1.num = 1234;  // 編譯錯誤：num 是 private，無法直接存取
        // car1.gas = 20.5;  // 編譯錯誤：gas 是 private，無法直接存取

        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("指定不正確的汽油量(-10.0)看看");

        car1.setNumGas(1234, -10.0);
        car1.show();
    }
}

// Car類別
class Car
{
    private int num;      // 將欄位設為private使外部無法作直接存取
    private double gas;

    public void setNumGas(int n, double g)
    {
        if (g > 0 && g < 100)   // 判斷汽油值要在此範圍才能更改
        {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "，汽油量設為" + gas);
        }
        else
        {
            System.out.println(g + "不是正確的汽油量");
            System.out.println("無法變更汽油量");
        }
    }

    public void show()
    {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
