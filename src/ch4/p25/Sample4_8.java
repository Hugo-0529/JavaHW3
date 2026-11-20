package ch4.p25;

// CH4 P25：Object 類別的 equals 方法
public class Sample4_8
{
    public static void main(String[] args)
    {
        Car car1 = new Car();   // car1 與 car2 分別代表不同的物件
        Car car2 = new Car();

        Car car3;               // car1 與 car3 代表相同的物件
        car3 = car1;

        System.out.println("car1與car2相同 " + car1.equals(car2));
        System.out.println("car1與car3相同 " + car1.equals(car3));
    }
}

class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}
