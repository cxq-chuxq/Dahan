import java.util.Scanner;
public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("班级的总分和平均分");
        System.out.println("几个班：");
        int n = sc.nextInt();
        System.out.println("几位同学：");
        int m = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个班" + m + "位同学的成绩：(空格隔开,分数0-100之间)");
            String firstClass = sc2.nextLine();
            String[] score = firstClass.split(" ");
            int sum = 0;
            double average = 0.00;
            for (String str : score) {
                sum = sum + Integer.parseInt(str);
                average = (double) sum / m;
            }
            System.out.println("该班的总分为：" + sum);
            System.out.println("该班的平均分为：" + average);
        }
    }
}