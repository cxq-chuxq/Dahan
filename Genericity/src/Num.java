//定义泛型类，成员变量是Number类或其子类对象的数组，成员方法有：求数组元素最小值、最大值和平均值。创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
public class Num<T extends Number> {
    private T[] array;

    public Num(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (String.valueOf(max).compareTo(String.valueOf(array[i])) < 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T getMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (String.valueOf(min).compareTo(String.valueOf(array[i])) > 0) {
                min = array[i];
            }
        }
        return min;
    }

    public void getAverage()  {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer || array[i] instanceof Double) {
                sum += array[i].doubleValue();
            }
        }
        double average = sum / array.length;
        System.out.println(average);
    }
}
