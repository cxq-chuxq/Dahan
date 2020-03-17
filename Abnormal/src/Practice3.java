//3.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
//如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。并提示用户再次输入该数
import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入求平均数的整数的个数：");
        int num = sc.nextInt();
        int input;
        double sum = 0;
        for (int i = 1; i < num + 1; i++) {
            System.out.println("请输入第" + i + "个整数：");
            try {
                input = sc.nextInt();
                if (input < 0) {
                    throw new IllegalArgumentException("N必须是正数或者0");
                }
                sum = sum + input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ",请重新输入");
                i = i - 1;
            }
        }
        System.out.println("平均数是：" + sum / num);
        sc.close();
    }
}