import java.util.Scanner;
public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n行n列乘法口诀表，请输入n：");
        int  n = sc.nextInt();
        System.out.println("乘法口诀表：" + n + "行" + n + "列如下：");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}