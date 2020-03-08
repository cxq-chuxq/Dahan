import java.util.Scanner;
public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三十个任意0-9的数字(用空格隔开)");
        String str = sc.nextLine();
        int[] count = new int[10] ;
        String[] num = str.split(" ");
        for (int i = 0; i <= 9; i++) {
            for (String st : num) {
                if (Integer.parseInt(st) == i) {
                    count[i]++;
                }
            }
            System.out.println("出现" + i + "的次数为" + count[i]);
        }
    }
}