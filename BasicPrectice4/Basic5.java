import java.util.Arrays;
public class Basic5 {
    public static void main(String[] args) {
        int[] arrayA = new int[] { 1, 2, 6, 6, 5, 0 , 1, 1, 1, 1};
        int[] arrayB = new int[] {};
        arrayB =  arrayA.clone();
        System.out.println(Arrays.toString(arrayB));
    }
}