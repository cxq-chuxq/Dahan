//2.写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
//如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
//如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
import java.util.Scanner;
public class Practice2 {
    ppublic static void isTriangle(int a, int b, int c) {
        try {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("三角形的边长分别为:" + a + "," + b + "," + c);
            } else {
                throw new IllegalAccessException("a,b,c不能构成三角形");
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入边长1");
        int a = sc.nextInt();
        System.out.println("请输入边长2");
        int b = sc.nextInt();
        System.out.println("请输入边长3");
        int c = sc.nextInt();
        sc.close();
        isTriangle(a, b, c);
    }
}
