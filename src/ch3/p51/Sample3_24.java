package ch3.p51;

// CH3 P51：物件的陣列
public class Sample3_24
{
    public static void main(String[] args)
    {
        Car[] car1;
        car1 = new Car[3];   // 準備好 Car[] 型態陣列變數，宣告三個陣列元素

        for (int i = 0; i < car1.length; i++)
        {
            car1[i] = new Car();   // 建立三個新物件，分別指定給陣列元素
        }

        car1[0].setCar(1234, 20.5);   // 分別為陣列元素做setCar方法
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        for (int i = 0; i < car1.length; i++)
        {
            car1[i].show();
        }
    }
}

class Car
{
    int num;
    double gas;

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
