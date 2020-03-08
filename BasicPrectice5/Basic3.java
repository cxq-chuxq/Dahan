import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个季度：");
        int  a = sc.nextInt();
        System.out.println("第二个季度：");
        int  b = sc.nextInt();
        System.out.println("第三个季度：");
        int  c = sc.nextInt();
        System.out.println("第四个季度：");
        int  d = sc.nextInt();
        int m = a + b + c + d;
        System.out.println("输出的和为：" + m);
    }
}