package ch3.p26;

// CH3 P26：建構式(constructor)
public class Sample3_12
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();   // 建立新物件就會呼叫建構式

        car1.show();
    }
}

// Car類別
class Car
{
    private int num;
    private double gas;

    // 建構式名稱與類別名稱相同，通常用來作初始化設定
    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
