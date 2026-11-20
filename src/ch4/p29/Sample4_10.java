package ch4.p29;

// CH4 P29~P30：抽象類別
public class Sample4_10
{
    public static void main(String[] args)
    {
        Vehicle[] vc = new Vehicle[2];   // 準備抽象類別的陣列

        vc[0] = new Car(1234, 20.5);     // 第一個物件是Car類別
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);          // 第二個物件是Plane類別
        vc[1].setSpeed(500);

        for (int i = 0; i < vc.length; i++)
        {
            vc[i].show();   // 呼叫對應該物件之類別的show方法
        }
    }
}

// 父類別 (抽象類別)
abstract class Vehicle
{
    protected int speed;

    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();   // 抽象方法
}

// 子類別1：延伸抽象類別
class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }

    // 定義show方法內的內容
    @Override
    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

// 子類別2：延伸抽象類別
class Plane extends Vehicle
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
        System.out.println("速度是" + speed);
    }
}
