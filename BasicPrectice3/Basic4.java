import java.util.Scanner;
public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输人一个整数：");
        int  a = sc.nextInt();
        if (a % 5 == 0) {
            if (a % 6 == 0) {
                System.out.println("该数可以同时被5和6整除");
            } else {
                System.out.println("该数能被5整除但不能被6整除");
            }
        } else {
            if (a % 6 == 0) {
                System.out.println("该数能被6整除但不能被5整除");
            } else {
                System.out.println("该数不能能被5或6整除");
            }
        }
    }
}