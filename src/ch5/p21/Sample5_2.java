package ch5.p21;

// CH5 P21：try ~ catch
class Sample5_2
{
    public static void main(String[] args)
    {
        try
        {
            int[] test;
            test = new int[5];

            System.out.println("將值指定給test[10]");

            test[10] = 80;   // 超過陣列元素的數量，發生例外
            System.out.println("將80指定給test[10]");   // 發生例外所以此行不會處理
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("超過陣列的範圍了");
        }

        System.out.println("順利地執行完畢了");   // 此行還是會繼續處理
    }
}
