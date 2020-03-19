import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Practice5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        char[] chr = str.toCharArray();
        Set<Character> set = new TreeSet<Character>();
        for (char cr : chr) {
            set.add(cr);
        }
        System.out.println("不同的字符如下");
        System.out.println(set.toString());
        sc.close();
    }

}
