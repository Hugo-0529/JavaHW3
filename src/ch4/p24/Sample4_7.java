package ch4.p24;

// CH4 P24：覆寫 Object 類別的 toString 方法
public class Sample4_7
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.setCar(1234, 20.5);
        System.out.println(car1);   // println 會呼叫 toString() 將物件轉為字串
    }
}

class Car
{
    protected int num;
    protected double gas;

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

    // 覆寫Object類別的toString方法 (若不覆寫，會印出 Car@雜湊碼)
    @Override
    public String toString()
    {
        String str = "車號:" + num + "汽油量:" + gas;
        return str;   // 此字串為傳回值
    }
}
