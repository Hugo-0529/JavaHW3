package ch4.p41;

// CH4 P41~P42：多重繼承 (實作兩個以上的介面)
public class Sample4_13
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}

// 介面1
interface iVehicle
{
    void vShow();   // iVehicle 的抽象方法
}

// 介面2
interface iMaterial
{
    void mShow();   // iMaterial 的抽象方法
}

// 類別：可以實作兩個以上的介面
class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    // 定義iVehicle的方法
    @Override
    public void vShow()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    // 定義iMaterial的方法
    @Override
    public void mShow()
    {
        System.out.println("車子的材質是鐵");
    }
}
