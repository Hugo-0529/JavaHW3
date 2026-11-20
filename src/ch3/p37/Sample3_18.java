package ch3.p37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// CH3 P37：大寫與小寫轉換
public class Sample3_18
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入英文字母");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String stru = str.toUpperCase();   // 將str轉成大寫放到stru
        String strl = str.toLowerCase();   // 將str轉成小寫放到strl

        System.out.println("轉換成大寫時為" + stru);
        System.out.println("轉換成小寫時為" + strl);
    }
}
