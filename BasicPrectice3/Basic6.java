import java.util.Scanner;
public class Basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三十以内的任意一个数");
        int y = 0;
        int count = 0;
        int num = 0;
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (count == 0) {
                y = x;
            } else {
                if (y == x) {
                    num++;
                }
                if (count == 10) {
                    System.out.println("该数出现的次数为:" + num);
                    break;
                }
            }
            count++;
            System.out.println("请输入三十以内的任意一个数:(第" + count + "次)");

        }
    }
}