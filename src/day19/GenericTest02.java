package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
        myList.add(new Cat());

        Iterator<Animal> it1 = myList.iterator();
        while(it1.hasNext()){
            Animal a= it1.next();
            a.move();
        }
        System.out.println(myList.size());

        System.out.println("==================================");
        List<String> myStrings = new ArrayList<>();

        myStrings.add("abc123123123");
        myStrings.add("def123123123");
        myStrings.add("xyz123123");
        myStrings.add("www.baidu.com.cn");
        myStrings.add("www.google.com.cn");
        Iterator<String> it2 = myStrings.iterator();
        while(it2.hasNext()){
            String s = it2.next();
            String newString =s.substring(7);
            System.out.println(s);
            System.out.println(newString);
        }
        System.out.println(myStrings.size());
    }
}
