//在一个列表中存储以下元素：apple,grape,banana,pear
//  返回集合中的最大的和最小的元素
//  将集合进行排序，并将排序后的结果打印在控制台上
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list.toString());
    }
}
