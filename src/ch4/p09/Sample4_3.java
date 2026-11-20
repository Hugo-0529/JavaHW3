package ch4.p09;

// CH4 P9~P10：保護成員 protected
public class Sample4_3
{
    public static void main(String[] args)
    {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.newShow();
    }
}

// 父類別
class Car
{
    protected int num;      // 將父類別的成員設為保護成員
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

    public void newShow()
    {
        // 子類別可以存取父類別的保護成員 num、gas
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}
