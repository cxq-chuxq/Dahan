import java.util.Scanner;
public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer strbuffNum = new StringBuffer();
        StringBuffer contactNum = new StringBuffer();
        int num = sc.nextInt();
        String strNum = String.valueOf(num);// int 转 string
        strbuffNum.append(strNum);
        StringBuffer reversebuffNum = strbuffNum.reverse();// 利用stringbuff的reverse方法
        String reverseNum = reversebuffNum.toString();
        char[] array = reverseNum.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int crnum = array[i] - '0';
            int addFiveNum = (crnum + 5) % 10;
            contactNum = contactNum.append(addFiveNum);
        }
        char c1 = contactNum.charAt(0);
        char c2 = contactNum.charAt(contactNum.length() - 1);
        contactNum.replace(0, 1, c2 + "");
        contactNum.replace(contactNum.length() - 1, contactNum.length(), c1 + "");
        System.out.println(contactNum);
    }
}
