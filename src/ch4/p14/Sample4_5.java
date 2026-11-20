package ch4.p14;

// CH4 P14~P15：用父類別的變數操作子類別的物件
public class Sample4_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new RacingCar();   // 從父類別的變數操作子類別的物件

        car1.setCar(1234, 20.5);

        // car1.setCourse(5);  // 無法呼叫：Car 類別的變數只能存取 Car 有的方法

        car1.show();   // 呼叫的是子類別的show：與 new 的物件有關，與變數型態無關
    }
}

// 父類別
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

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

// 子類別
class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }

    @Override
    public void show()
    {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}
