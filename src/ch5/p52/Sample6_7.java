package ch5.p52;

// CH5 P52：未同步化 —— 兩名駕駛同時呼叫 add，可能得到錯誤的合計金額
class Sample6_7
{
    public static void main(String[] args)
    {
        Company cmp = new Company();   // 建立公司物件

        Driver drv1 = new Driver(cmp); // 建立駕駛物件1
        drv1.start();

        Driver drv2 = new Driver(cmp); // 建立駕駛物件2
        drv2.start();
    }
}

class Company
{
    private int sum = 0;

    // 匯入金額的處理過程 (沒有 synchronized)
    public void add(int a)
    {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");
        System.out.println("賺到" + a + "元了。");
        tmp = tmp + a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driver extends Thread
{
    private Company comp;

    public Driver(Company c)
    {
        comp = c;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            comp.add(50);   // 進行匯入金額
        }
    }
}
