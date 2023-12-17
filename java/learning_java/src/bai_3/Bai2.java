package bai_3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        
        while (number > 0) {
    
            System.out.println("valid number: " + number);
            number = scanner.nextInt();
        }
        System.out.println("InValid number: " + number);
    }
}
