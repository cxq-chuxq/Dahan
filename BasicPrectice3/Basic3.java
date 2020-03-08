import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        while (sc.hasNext()) {
            int x = sc.nextInt();
            count++;
            if (x == 0) {
                System.out.println("输入0跳出循环");
                break;
            } else if (count == 1) {
                max = x;
                min = x;
            } else {
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }
            System.out.println("最大值" + max);
            System.out.println("最小值" + min);
        }
    }
}