package ch5.p46;

// CH5 P46：暫時停止執行緒 sleep
class Sample6_3
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();

        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
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
            try
            {
                sleep(1000);   // 執行緒每次暫停1000毫秒
                System.out.println("正在進行" + name + "的處理工作");
            }
            catch (InterruptedException e)   // 可能被sleep方法拋出的例外
            {
            }
        }
    }
}
