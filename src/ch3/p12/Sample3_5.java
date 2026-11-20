package ch3.p12;

// CH3 P12：在類別的方法中呼叫類別內其他方法
public class Sample3_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
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

    void showCar()
    {
        System.out.println("開始顯示車子資料");
        this.show();   // 呼叫物件本身的方法 (this 可不加)
    }
}
