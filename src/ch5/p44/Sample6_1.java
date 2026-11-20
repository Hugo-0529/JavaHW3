package ch5.p44;

// CH5 P44：延伸 Thread 類別建立執行緒
class Sample6_1
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();   // 啟動新執行緒

        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

// 延伸Thread類別
class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    // 覆寫run方法，想要在其他執行緒執行的程式需寫在此方法
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
