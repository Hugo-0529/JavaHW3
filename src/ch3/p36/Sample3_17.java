package ch3.p36;

// CH3 P36：String 類別取得字元與長度
public class Sample3_17
{
    public static void main(String[] args)
    {
        String str = "Hello";   // 相當於 String str = new String("Hello");

        char ch1 = str.charAt(0);   // 取得字串的第一個字元
        char ch2 = str.charAt(1);   // 取得字串的第二個字元

        int len = str.length();     // 取得字串長度

        System.out.println(str + "的第一個字元是" + ch1);
        System.out.println(str + "的第二個字元是" + ch2);
        System.out.println(str + "的長度是" + len);
    }
}
