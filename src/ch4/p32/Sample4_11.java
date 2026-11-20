package ch4.p32;

// CH4 P32~P33：instanceof 運算子
public class Sample4_11
{
    public static void main(String[] args)
    {
        Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);   // 第一個物件是Car類別
        vc[1] = new Plane(232);        // 第二個物件是Plane類別

        for (int i = 0; i < vc.length; i++)
        {
            if (vc[i] instanceof Car)   // 檢查物件是否為Car類別 (也可用 vc[i].getClass() == Car.class)
                System.out.println("第" + (i + 1) + "個物件是Car類別");
            else
                System.out.println("第" + (i + 1) + "個物件不是Car類別");
        }
    }
}

// 父類別
abstract class Vehicle
{
    protected int speed;

    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();
}

// 子類別1
class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    @Override
    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

// 子類別2
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
