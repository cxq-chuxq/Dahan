import java.util.Scanner;
public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进位整数：");
        int  a = sc.nextInt();
        String b = Integer.toString(a, 2);
        System.out.println(b);
    }
}