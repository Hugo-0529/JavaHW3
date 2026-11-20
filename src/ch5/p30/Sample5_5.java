package ch5.p30;

// CH5 P30~P31：自訂例外並拋出 (throw)，在呼叫端用 try ~ catch 處理
class Sample5_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        try
        {
            car1.setCar(1234, -10.0);   // 呼叫此方法來拋出例外
        }
        catch (CarException e)
        {
            System.out.println("拋出" + e + "了");
        }

        car1.show();
    }
}

// 繼承Exception類別的自定義例外CarException
class CarException extends Exception
{
}

class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    // 宣告此方法有可能拋出CarException例外
    public void setCar(int n, double g) throws CarException
    {
        if (g < 0)
        {
            CarException e = new CarException();
            throw e;   // g小於零時拋出例外
        }
        else
        {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "，汽油量設為" + gas);
        }
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
