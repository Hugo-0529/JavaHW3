package ch5.p48;

// CH5 P48：等待執行緒處理完畢 join
class Sample6_5
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();

        try
        {
            car1.join();   // 等到car1執行緒處理完才繼續執行main
        }
        catch (InterruptedException e)
        {
        }

        System.out.println("結束main()的處理工作。");
    }
}

class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作。");
        }
    }
}
