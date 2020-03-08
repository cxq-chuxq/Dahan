public class Basic3 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            int num = 5;
            for (int j = 0; j < 5 - i; j++) {
                arr[i][j] = num;
                System.out.print(arr[i][j]);
                num--;
            }
            System.out.println();

        }
    }
}