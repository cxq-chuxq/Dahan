import java.util.Scanner;
public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jishu = 0;
        int oushu = 0;
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x == -1) {
                System.out.println("输入-1为结束");
                System.out.println("奇数的个数为:" + jishu);
                System.out.println("偶数的个数为:" + oushu);
                break;
            }
            if (x % 2 == 0) {
                oushu++;
            } else {
                jishu++;
            }
        }
    }
}