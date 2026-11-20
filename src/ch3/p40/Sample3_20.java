package ch3.p40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// CH3 P40：StringBuffer 可以修改字串內容
public class Sample3_20
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入字串。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println("請輸入要新增的字串。");

        String str2 = br.readLine();

        StringBuffer sb = new StringBuffer(str1);   // 建立物件sb並傳入str1到字串緩衝區
        sb.append(str2);                            // 將str2接到字串緩衝區後面

        System.out.println("在「" + str1 + "」後新增「" + str2 + "」的話，就會變成「" + sb + "」。");
    }
}
