package ch5.p32;

// CH5 P32：透過 throws 把處理例外的工作交給呼叫端 (main 也不處理 → 程式中止)
class Sample5_5
{
    public static void main(String[] args) throws CarException   // 透過throws的方式處理例外
    {
        Car car1;
        car1 = new Car();

        car1.setCar(1234, -10.0);   // 這裡就不用加 try~catch

        car1.show();
    }
}

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

    public void setCar(int n, double g) throws CarException
    {
        if (g < 0)
        {
            CarException e = new CarException();
            throw e;
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
