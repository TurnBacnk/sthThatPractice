package day15;

/**
 * 产生5个不同的随机数
 * 重要条件i--；
 */

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class RandomTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int[] arr = new int[5];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[i] = -1;
        }
        Random random = new Random();
        int index = 0;
        while (index < arr.length) {
            int num = random.nextInt(range);
            if (!contains(arr, num)) {
                arr[index] = num;
                index++;
            }
        }
        Arrays.sort(arr);
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }
    }

    public static boolean contains(int[] arr , int key)
    {
        /**
         * Arrays.sort(arr);
         * return Arrays.binarySearch(arr,key)>=0;
         */
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if (arr[i]==key){
                return true;
            }
        }
        return false;

    }
}
