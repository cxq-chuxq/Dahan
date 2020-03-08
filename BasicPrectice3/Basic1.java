import java.util.Scanner;
public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输人第一个学生的分数");
        int  a = sc.nextInt();
        System.out.println("请输人第二个学生的分数");
        int  b = sc.nextInt();
        System.out.println("请输人第三个学生的分数");
        int  c = sc.nextInt();
        System.out.println("请输人第四个学生的分数");
        int  d = sc.nextInt();
        System.out.println("请输人第五个学生的分数");
        int  e = sc.nextInt();
        int m = a + b + c + d + e;
        System.out.println("输出的和为：" + m);
    }
}