package ch5.p40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// CH5 P40：命令列引數 (執行方式：java ch5.p40.Sample5_9 test3.txt)
class Sample5_9
{
    public static void main(String[] args)
    {
        if (args.length != 1)   // 檢查使用者輸入的字串數量
        {
            System.out.println("請指定正確的檔案名稱");
            System.exit(1);
        }

        try
        {
            // 從輸入的第一個字串(檔案名稱)開始建立文字串流
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String str;
            while ((str = br.readLine()) != null)
            {
                System.out.println(str);
            }

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("輸出入錯誤");
        }
    }
}
