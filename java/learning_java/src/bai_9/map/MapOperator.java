package bai_9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperator {
    public static void main(String[] args) {
        //1. Map
        //2. trien khai map --> HashMap, TreeMap, LinkedHashMap
        Map<Integer, String> fruits = new HashMap<>();
        
        //add
        fruits.put(1, "apple");
        fruits.put(2, "orange");
        fruits.put(5, "banana");
        fruits.put(3, "Cherry");
        fruits.put(4, "lemon");
    
        //print --> print key --> value
        System.out.println(fruits);
        
        //print only values
        Collection<String> values = fruits.values();
        for (String fruit : values) {
            System.out.println(fruit);
        }
        
        //print only keys
        Set<Integer> keyFruits = fruits.keySet();
        for (Integer key : keyFruits) {
            System.out.println(key);
        }
        
        //get value by key
        String apple = fruits.get(1);
        System.out.println(apple);
        
        //neu khong ton tai key trong map, return null
        System.out.println(fruits.get(6));
        
        //update value by key
        fruits.put(2, "orange update");
        fruits.replace(3, "banana update");
        System.out.println("fruits after update");
        System.out.println(fruits);
        
        //remove
        fruits.remove(5);
        System.out.println("fruits after removed");
        System.out.println(fruits);
        
        //size
        System.out.println("size of map: " + fruits.size());
    
        //check key exits in map
        boolean containsKeyBanana = fruits.containsKey(3);
        System.out.println(containsKeyBanana);
        
        boolean containsKeyNotExist = fruits.containsKey(6);
        System.out.println(containsKeyNotExist);
        
        //check values exits in map
        System.out.println(fruits);
        boolean containsValueCherry = fruits.containsValue("Cherry");
        System.out.println("containsValueCherry: " + containsValueCherry);
        
        boolean containsValueNotExist = fruits.containsValue("watermelon");
        System.out.println("containsValueNotExist: " + containsValueNotExist);
    
        //clear
        fruits.clear();
        System.out.println("size of after clear: " + fruits.size());
        
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("apple", 3);
        System.out.println(map);
        
        Map<Character, Integer> map2 = new HashMap<>();
        
        map2.put('B', 2);
        map2.put('C', 4);
        map2.put('G', 5);
        map2.put('A', 66);
        System.out.println(map2);
    }
}
