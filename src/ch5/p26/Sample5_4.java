package ch5.p26;

// CH5 P26：輸出例外的種類
class Sample5_4
{
    public static void main(String[] args)
    {
        try
        {
            int[] test;
            test = new int[5];

            System.out.println("將值指定給test[10]");

            test[10] = 80;
            System.out.println("將80指定給test[10]");
        }
        catch (ArrayIndexOutOfBoundsException e)   // 接收到例外
        {
            System.out.println("超過陣列的範圍了");
            System.out.println("發生了" + e + "這個例外");   // 輸出例外的種類
        }
        finally
        {
            System.out.println("最後一定會執行這個處理");
        }

        System.out.println("順利地執行完畢了");
    }
}
