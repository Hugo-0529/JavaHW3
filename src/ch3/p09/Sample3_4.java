package ch3.p09;

// CH3 P9：物件名稱.欄位名稱 / 欄位名稱 / this.欄位名稱
public class Sample3_4
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;   // 類別外：物件名稱.欄位名稱
        car1.gas = 20.5;

        car1.show();
        car1.showWithThis();
    }
}

// Car類別
class Car
{
    int num;
    double gas;

    void show()
    {
        // 類別內：直接使用欄位名稱
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    void showWithThis()
    {
        // 類別內：this.欄位名稱 (效果相同)
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
