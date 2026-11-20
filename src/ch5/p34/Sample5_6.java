package ch5.p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// CH5 P34：標準輸入串流
class Sample5_6
{
    public static void main(String[] args)
    {
        System.out.println("請輸入字串");

        try
        {
            // 指定標準輸入並建立文字串流，透過緩衝區來讀入
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();   // 從緩衝區讀取一行資料

            System.out.println("已輸入字串" + str);
        }
        catch (IOException e)
        {
            System.out.println("輸入輸出有誤");
        }
    }
}
