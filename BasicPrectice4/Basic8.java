public class Basic8 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 6, 6, 5, 0 };
        int indexMax = 0;
        int indexMin = 0;
        int min = 0;
        int max = 0;// 定义最大数
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            if (j >= max) {
                max = j;
                indexMax = i;
            }
            if (j <= min) {
                min = j;
                indexMin = i;
            }
        }
        System.out.println("最大数" + max);
        System.out.println("最大数下标" + indexMax);
        System.out.println("最小数" + min);
        System.out.println("最小数下标" + indexMin);
    }
}
