package ch3.p38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// CH3 P38：搜尋文字 indexOf
public class Sample3_19
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入字串");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println("請輸入要檢索的文字");

        String str2 = br.readLine();
        char ch = str2.charAt(0);

        int num = str1.indexOf(ch);   // 搜尋字串str1內ch字元的位置並回傳索引值

        if (num != -1)   // 搜尋不到會回傳 -1，所以用 if 做錯誤處理
            System.out.println(str1 + "的第" + (num + 1) + "個字就是「" + ch + "」");
        else
            System.out.println(str1 + "中沒有「" + ch + "」這個字");
    }
}
