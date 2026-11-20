package ch4.p06;

// CH4 P6~P7：從子類別的建構式呼叫父類別的建構式 super()
public class Sample4_2
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);   // 呼叫子類別三個參數的建構式
    }
}

// 父類別
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    // 被子類別呼叫到的建構式
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
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

    public RacingCar(int n, double g, int c)
    {
        super(n, g);   // 呼叫父類別雙參數的建構式
        course = c;
        System.out.println("生產了編號為" + course + "的賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}
