package day19;

import java.util.ArrayList;
import java.util.Iterator;

public class ForeachTest01 {
    public static void main(String[] args) {
        int[] arr = {10,22,33,11,2,4,111,99};
        for ( int k : arr ) {
            System.out.println(k);
        }
        System.out.println("=====================");
        for ( int j : arr ) {
            System.out.println(j);
        }
        System.out.println("=====================");
        ArrayList myList = new ArrayList();
        myList.add("123");
        myList.add("abc");
        Iterator<String> it1 = myList.iterator();
        while(it1.hasNext()){
            String s = it1.next();
            System.out.println(s);
        }

        System.out.println("=========================");
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }

        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("asd");
        myStrings.add("ddfg");

        for ( int i = 0 ; i < myList.size() ; i++ ) {
            System.out.println(myList.get(i));
        }
        for ( String s: myStrings) {
            System.out.println(s);
        }
    }
}
