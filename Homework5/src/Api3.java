public class Api3 {
    public static void main(String[] args) {
        //将字符串中指定部分进行反转。
        String str = "abcdefghijklmn";
        int start=1;
        int end=7;
        System.out.println("初始字符串为: "+str);
        String str1=strReverse(str, start, end);
        System.out.println("反转后的字符串为: "+str1);

    }

    private static String strReverse(String str, int start, int end) {
        tring str1=str.substring(start, end);
        StringBuffer buffStr = new StringBuffer(str1);
        buffStr.reverse();
        return buffStr.toString();
    }
}
