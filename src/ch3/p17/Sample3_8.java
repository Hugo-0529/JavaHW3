package ch3.p17;

// CH3 P17：有傳回值的方法
public class Sample3_8
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1.setNumGas(1234, 20.5);

        int number = car1.getNum();        // 呼叫getNum，並將傳回值指定給number
        double gasoline = car1.getGas();   // 呼叫getGas，並將傳回值指定給gasoline

        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + "，汽油量是" + gasoline);
    }
}

// Car類別
class Car
{
    int num;
    double gas;

    // 有回傳值的方法，回傳型別為int
    int getNum()
    {
        System.out.println("調查車號");
        return num;
    }

    // 有回傳值的方法，回傳型別為double
    double getGas()
    {
        System.out.println("調查汽油量");
        return gas;
    }

    // 無回傳值的方法
    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
}
