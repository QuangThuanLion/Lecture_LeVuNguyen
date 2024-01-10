package bai_9;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        //LinkedList --> implement cua List
        //add, get, set, remove, clear, size, containingOf, indexOf, lastIndexOf
    
        List<String> products = new LinkedList<>();
        products.add("apple");
        products.add("nokia");
        products.add("samsung");
    
        String nokia = products.get(1);
        System.out.println("nokia: " + nokia);
        
        products.forEach(product -> {
            System.out.println(product);
        });
        
        products.set(2, "samsung_update");
        System.out.println("--PRODUCT AFTER UPDATE--");
        products.forEach(product -> {
            System.out.println(product);
        });
        
        products.remove("nokia");
        System.out.println("--PRODUCT AFTER REMOVE NOKIA--");
        products.forEach(product -> {
            System.out.println(product);
        });
    
        int size = products.size();
        System.out.println("size of product List: " + size);
    
        int samsungUpdate = products.indexOf("samsung_update");
        System.out.println("index of samsung: " + samsungUpdate);
    
        boolean apple = products.contains("apple");
        System.out.println("apple in list: " + apple);
        
        products.add("samsung_update");
        products.add("samsung_update");
        System.out.println("--PRODUCT AFTER ADD SAMSUNG_UPDATE--");
        products.forEach(product -> {
            System.out.println(product);
        });
    
        int samsungUpdate1 = products.indexOf("samsung_update");
        System.out.println("index of samsung: " + samsungUpdate1);
    
        int lastIndexOfSamsungUpdate = products.lastIndexOf("samsung_update");
        System.out.println("index of lastIndexOfSamsungUpdate: " + lastIndexOfSamsungUpdate);
    }
}
