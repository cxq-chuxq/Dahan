import java.util.Scanner;
public class Basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个任意年份：");
        int  a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("该年份是闰年：");
        } else {
            System.out.println("该年份不是闰年：");
        }

    }
}