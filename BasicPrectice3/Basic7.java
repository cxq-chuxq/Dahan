import java.util.Scanner;
public class Basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int  a = sc.nextInt();
        int b;
        String c = "";
        while (a > 0) {
            b = a % 10;
            a = a / 10;
            c = c.concat(String.valueOf(b));
        }
        System.out.println("" + c);

    }
}