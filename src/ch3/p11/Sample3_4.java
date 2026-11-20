package ch3.p11;

// CH3 P11：呼叫方法
public class Sample3_4
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();   // 呼叫方法
        car1.show();   // 再一次呼叫方法
    }
}

// Car類別
class Car
{
    int num;
    double gas;

    // 定義方法
    void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
