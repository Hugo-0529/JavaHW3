package ch3.p06;

// CH3 P6：存取物件的成員
public class Sample3_2
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();      // 建立新物件

        car1.num = 1234;       // 指定車號
        car1.gas = 20.5;       // 指定汽油量

        System.out.println("車號是" + car1.num);
        System.out.println("汽油量是" + car1.gas);
    }
}

// Car類別
class Car
{
    int num;
    double gas;
}
