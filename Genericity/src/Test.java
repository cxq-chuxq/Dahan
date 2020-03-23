//定义泛型类，成员变量是Number类或其子类对象的数组，成员方法有：求数组元素最小值、最大值和平均值。创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
public class Test {
    public static void main(String[] args) throws NumberFormatException, Exception {
        Num<Integer> num1 = new Num<Integer>(new Integer[] { 1, 2, 3 });
        Num<Double> num2 = new Num<Double>(new Double[] { 1.0, 2.0, 3.3 });
        System.out.println(num1.getMax());
        System.out.println(num1.getMin());
        num1.getAverage();
        System.out.println(num2.getMax());
        System.out.println(num2.getMin());
        num2.getAverage();
    }
}
