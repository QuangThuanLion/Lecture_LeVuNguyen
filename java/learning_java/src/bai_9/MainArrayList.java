package bai_9;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        //1. ArrayList
        //2. LinkedList
        List<Integer> numbers = new ArrayList<>();
        //add phan tu vao trong list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        //hien thi toan bo phan tu trong list
        for (Integer item : numbers) {
            System.out.println(item);
        }
        
        //hien thi 1 phan tu chi dinh trong list
        System.out.println("number1: " + numbers.get(1));
        
        //update phan tu o trong list
        numbers.set(1, 5);
        System.out.println("--NUMBER AFTER CHANGED---");
        for (Integer item : numbers) {
            System.out.println(item);
        }
        
        //chen 1 phan tu trong list
        numbers.add(1, 10);
        System.out.println("--NUMBER AFTER UPDATED--");
        numbers.forEach(a -> {
            System.out.println("item changed: " + a);
        });
        
        //lay size of list
        System.out.println("size of list: " + numbers.size());
        
        //xoa 1 phan tu trong list
        numbers.remove(3);
        System.out.println("--NUMBER AFTER REMOVED--");
        numbers.forEach(item -> {
            System.out.println("item remove: " + item);
        });
        
        //lay xem gia tri do dang la phan tu index thu may
        int indexOfNumbers = numbers.indexOf(10);
        System.out.println("indexOfNumbers: " + indexOfNumbers);
        
        //check item ton tai trong list
        boolean contains = numbers.contains(11);
        System.out.println("exits 10 in list: " + contains);
        
        //add all toan bo vao trong 1 list
        List<Integer> listOtherAdded = new ArrayList<>();
        listOtherAdded.add(11);
        listOtherAdded.add(9);
        listOtherAdded.add(20);
        numbers.addAll(listOtherAdded);
        System.out.println("--NUMBER AFTER ADDED ALL--");
        numbers.forEach(x -> {
            System.out.println(x);
        });
    
        List<Integer> listOtherAdded2 = new ArrayList<>();
        listOtherAdded2.add(100);
        listOtherAdded2.add(90);
        numbers.addAll(3, listOtherAdded2);
        System.out.println("--NUMBER AFTER ADDED ALL INDEX--");
        numbers.forEach(x -> {
            System.out.println(x);
        });
    
        //clear item in list
        numbers.clear();
        System.out.println("--NUMBER AFTER CLEARED--");
        System.out.println("size of list: " + numbers.size());
    }
}
