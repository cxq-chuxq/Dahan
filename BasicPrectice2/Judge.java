import java.util.Scanner;
class Judge {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入一个数");
        int  num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("输入的数为偶数");
        } else {
            System.out.println("输入的数为奇数");
        }
    }
}

