package ch4.p38;

// CH4 P38~P39：介面 interface
public class Sample4_12
{
    public static void main(String[] args)
    {
        iVehicle[] ivc;
        ivc = new iVehicle[2];          // 準備介面的陣列

        ivc[0] = new Car(1234, 20.5);   // 第一個物件是Car類別

        ivc[1] = new Plane(232);        // 第二個物件是Plane類別

        for (int i = 0; i < ivc.length; i++)
        {
            ivc[i].show();   // 一個show方法根據狀況表現不同結果 (多型)
        }
    }
}

// 宣告介面
interface iVehicle
{
    int weight = 1000;   // 欄位一定要初始化為常數 (public static final)
    void show();         // 抽象方法
}

// 類別1：實作介面
class Car implements iVehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    // 定義抽象方法的處理內容
    @Override
    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

// 類別2：實作介面
class Plane implements iVehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    @Override
    public void show()
    {
        System.out.println("飛機的班次是" + flight);
    }
}
