package ch5.p14.pb;

import ch5.p14.pc.Car;   // 匯入套件pc的Car類別

// CH5 P14：匯入(import)以後就不用加套件名稱
class Sample5_4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
    }
}
