package day14;

import java.util.Arrays;

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {112,2,3,4,2,5,1,2,0};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
