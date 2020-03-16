import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Timu1and2and15and16 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 将 byte [] by={65,67,68,97,98,101} 转换成字符串输出
        byte[] by = { 65, 67, 68, 97, 98, 101 };
        String str1 = new String(by);
        System.out.println(str1);
        // 将上诉字节数组 从指定的位置开始到结束转换成字符串输出
        String str2 = new String(by, 1, 5); // 从第二位开始到结束
        System.out.println(str2);
        //题目2和题目15是一样的。同样的自定义一个字符数组用字符串的方式输出,
        char[] chr = { 65, 66, 67, 97, 98, 99 };//数字代表ascii码
        String str3 = new String(chr);
        System.out.println(str3);
        //题目16 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        String encodeFormat = "UTF-8"; // 常见的编码格式ASCII码,ISO-8859-1,GBK,UTF-16,UTF-8
        String str4 = new String(by, encodeFormat);
        System.out.println(Arrays.toString(by) + "以" + encodeFormat + "的编码格式转换成字符串后为" + str4);
        byte[] by2 = str4.getBytes(encodeFormat);
        System.out.println(str4 + "以" + encodeFormat + "的编码格式转换成字节数组后为：" + Arrays.toString(by2));
    }
}