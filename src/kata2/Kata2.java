package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        map.put(8, 3);
        map.put(6, 8);
        map.put(3, 0);
        map.put(5, 12);
        map.put(9, -23);
        
        System.out.println("::::: Método 1 :::::");
        if(!map.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
                
            }
        }
        
        System.out.println("::::: Método 2 :::::");
        for (Integer key : map.keySet()) {
            System.out.println("key = " + key); 
            System.out.println("* value = " + map.get(key));
        }
        
        for (Integer value : map.values()) {
            System.out.println("value = " + value);
        }
        
        System.out.println("::::: Método 3 :::::");
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        
        
        int[] array_0 = {1,2,14,4,5,6,3,8,9,4,1,2,3,14,5, 14};
        String[] array_1 = {"Milagros", "Pepe" , "Facundo", "Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram metaHistogram = new Histogram<String>(array_1);
        
        Map<String, Integer> histogram = metaHistogram.getHistogram();
        
        System.out.println("::::: Histogram v1 :::::");
        if(!histogram.isEmpty()) {
            for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
                System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
                
            }
        }
        
        
    }
    
}
