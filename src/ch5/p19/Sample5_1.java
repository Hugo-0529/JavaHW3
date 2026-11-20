package ch5.p19;

// CH5 P19：沒有例外處理時，程式會因例外而中止
class Sample5_1
{
    public static void main(String[] args)
    {
        int[] test;
        test = new int[5];

        System.out.println("將值指定給test[10]");

        test[10] = 80;   // 超過了陣列元素的數量，會發生 ArrayIndexOutOfBoundsException

        // 由於發生了例外，以下兩行不會繼續處理
        System.out.println("將80指定給test[10]");
        System.out.println("順利地執行完畢");
    }
}
