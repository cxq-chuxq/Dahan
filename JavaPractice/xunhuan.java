class xunhuan {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 50 + 1);
            for (int j = 0; j < 50; j++) {
                if (j == number - 1) {
                    arr[j]++;
                    System.out.println(arr[j] + "-----" + number);
                }
            }
        }
        for (int i = 0; i < 50; i++) {
            if (arr[i] != 0) {
                System.out.println((i + 1) + "出现了:" + arr[i] + "次");
            }
        }
    }
}