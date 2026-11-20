package ch3.p16;

// CH3 P16：傳回值語法 —— 傳回值的型態 方法名稱(參數列表) { ... return 運算式; }
// 方法的參數可以有很多個，但傳回值只能有一個
public class ReturnValue
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        int sum = calc.add(3, 5);            // 接收 int 傳回值
        double avg = calc.average(3, 5);     // 接收 double 傳回值
        boolean even = calc.isEven(sum);     // 接收 boolean 傳回值

        System.out.println("3 + 5 = " + sum);
        System.out.println("3 和 5 的平均是 " + avg);
        System.out.println(sum + " 是偶數嗎？" + even);
    }
}

class Calculator
{
    int add(int a, int b)
    {
        int result = a + b;
        return result;
    }

    double average(int a, int b)
    {
        return (a + b) / 2.0;
    }

    boolean isEven(int n)
    {
        return n % 2 == 0;
    }
}
