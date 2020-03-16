import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        //请设计一个方法，可以实现获取任意范围内的随机数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = sc.nextInt();
        System.out.println("请输入结束数：");
        int end = sc.nextInt();
        int num = getRan(start, end);
        System.out.println(num);

    }

    public static int getRan(int start, int end) {
        SecureRandom rd = new SecureRandom();
        int number = (int) (rd.nextInt(end - start + 1) + start);
        return number;
    }
}
