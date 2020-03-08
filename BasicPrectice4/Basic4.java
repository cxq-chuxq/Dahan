public class Basic4 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 6, 6, 5, 0 };
//        List<Integer> index =new ArrayList<>();
        int index = 0;
        int max = 0;// 定义最大数
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            if (j > max) {
                max = j;
                index = i;
            }
        }
        System.out.println("最大数" + max);
        System.out.println("下标" + index);
    }
}
