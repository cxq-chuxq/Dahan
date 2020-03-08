import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Basic7 {
    public static void main(String[] args) {
        int[] arrayA = new int[] { 1, 2, 6, 6, 5, 0, 1, 1, 1, 1 };
        List<Integer> index = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == x) {
                flag = true;
                index.add(i);
            }
        }
        if (flag) {
            System.out.println("下标为：" + index.toString());
        } else {
            System.out.println("找不到此整数");
        }
    }
}