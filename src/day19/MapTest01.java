package day19;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        /**
         * Set<Integer> keys = map.keySet();
         * Iterator<Integer> it = keys.iterator();
         * while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
         }
         */

        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("1");
        myArray.add("2");
        myArray.add("3");
        myArray.add("4");
        Iterator it2 = myArray.iterator();
        while(it2.hasNext()){
            String s = (String) it2.next();
            System.out.println(s);
        }

        Set<Map.Entry<Integer,String>> set  = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it3 = set.iterator();
        while(it3.hasNext()){
            Map.Entry<Integer,String> entry = it3.next();
            System.out.println(entry);
        }
        System.out.println("===================================");
        for(Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+"---------->"+node.getValue());
        }
    }
}
