package bai_4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int numbers[] = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("number["+i+"]");
            numbers[i] = scanner.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] >= 10) {
                System.out.println("number >= 10: " + numbers[i]);
                count ++;
            }
        }
        System.out.println("count number: " + count);
    }
}
