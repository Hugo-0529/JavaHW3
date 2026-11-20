package ch5.p36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// CH5 P36：從檔案讀取資料 (請先執行 ch5.p35.Sample5_7 產生 test1.txt)
class Sample5_8
{
    public static void main(String[] args)
    {
        try
        {
            // 指定檔案名稱並建立從檔案讀取資料的文字串流，透過緩衝區讀入
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

            String str1 = br.readLine();   // 從緩衝區一行一行讀入資料
            String str2 = br.readLine();

            System.out.println("寫入到檔案中的兩個字串是");
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("輸出入錯誤");
        }
    }
}
