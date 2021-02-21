package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListOrLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("123");
        list1.add("234");
        list1.add("345");
        list1.add("456");

        System.out.println(list1.get(3));

        System.out.println("========================");

        for ( int i = 0 ; i < list1.size() ; i++ ) {
            System.out.println(list1.get(i));
        }

        System.out.println("========================");

        Iterator<String> it1 = list1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("========================");

        LinkedList<Integer> list2 = new LinkedList<>();

        System.out.println("========================");

        for ( String i :
                list1 ) {
            System.out.println(i);
        }

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println(list2.get(4));

        System.out.println("========================");

        for ( int i = 0 ; i < list2.size() ; i++ ) {
            System.out.println(list2.get(i));
        }
        System.out.println("========================");

        Iterator<Integer> it2 = list2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("========================");

        for ( int j :
              list2 ) {
            System.out.println(j);
        }
    }
}
