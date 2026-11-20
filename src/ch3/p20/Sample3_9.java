package ch3.p20;

// CH3 P20：沒有存取限制時，外部可以指定錯誤的資料
public class Sample3_9
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = -10;    // 指定錯誤的汽油量資料

        car1.show();
    }
}

// Car類別
class Car
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
