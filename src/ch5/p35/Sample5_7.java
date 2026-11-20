package ch5.p35;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// CH5 P35：將資料寫入到檔案 (test1.txt 會產生在執行時的目前目錄)
class Sample5_7
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("test1.txt");                 // 指定檔案名稱並建立文字串流
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));    // 透過緩衝區輸出資料

            pw.println("Hello!");     // 一行一行輸出資料
            pw.println("GoodBye!");

            pw.close();               // 關閉檔案

            System.out.println("資料已經寫入檔案了");
        }
        catch (IOException e)
        {
            System.out.println("輸出入錯誤");
        }
    }
}
