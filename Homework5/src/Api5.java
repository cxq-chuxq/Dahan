import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Api5 {

//        面试题：5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
//        但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
//        应该输出为“我ABC”而不是“我ABC+汉的半个”。
    public static String subStr(String str, int byteNum) {
        if(str==null||str.isEmpty()) {
            return "输入字符串不能为空";
        }
        if(byteNum<=0) {
            return "输入字节数必须大于零";
        }
        // 先把字符串截取成字符char
        char[] sr = str.toCharArray();
        int num = 0;
        StringBuffer buffStr = new StringBuffer();
        for (char s : sr) {
            // 判断是否为汉字
            if (String.valueOf(s).matches("[\u4e00-\u9fa5]")) {
                num = num + 2;
                if (byteNum >= num) {
                    buffStr.append(s);
                } else {
                    return buffStr.toString();
                }
            } else {
                num = num + 1;
                if (byteNum >= num) {
                    buffStr.append(s);
                } else {
                    return buffStr.toString();
                }
            }
        }
        return buffStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汉字或字母或数字组成的字符串");
        String str = sc.next();
        int byteNum = sc.nextInt();
        System.out.println(subStr(str, byteNum));
    }
}
