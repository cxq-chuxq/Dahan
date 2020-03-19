//4.产生10个1~20之间的随机数，要求随机数不能重复


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Randoms {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> array = new TreeSet<Integer>();
        while (array.size() < 10) {
            int number = r.nextInt(20) + 1;
            array.add(number);
        }
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
