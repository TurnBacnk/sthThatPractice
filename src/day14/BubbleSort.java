package day14;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,4,100,999,23};
        int count=1;
        for (int i = arr.length-1; i >0 ; i--) {
            count++;
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.print(arr[i]+"\t");

        }
        System.out.println();
        System.out.println(count);
    }
}
