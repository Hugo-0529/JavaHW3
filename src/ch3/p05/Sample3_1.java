package ch3.p05;

// CH3 P5：建立新物件 (宣告類別型態變數 + new)
public class Sample3_1
{
    public static void main(String[] args)
    {
        Car car1;          // 宣告 car1 為 Car 類別的變數
        car1 = new Car();  // 建立 Car 物件並指定給變數 car1

        Car car2 = new Car();  // 宣告與建立也可以寫在同一行

        System.out.println("car1 已建立：" + (car1 != null));
        System.out.println("car2 已建立：" + (car2 != null));
    }
}

// Car類別
class Car
{
}
