//1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        try {
            while (sc.hasNext()) {
                int num = sc.nextInt();
                if (num >= 0 && num <= 100) {
                    System.out.println("分数为：" + num);
                } else {
                    throw new IllegalArgumentException("分数必须在0-100之间");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}