package bai_4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Chương trình cho phép người dùng nhập giá trị cho các phần tử
        //trong 2 mảng số nguyên cho trước. Mảng số nguyên thứ 3 được
        //khai báo có kích thước bằng tổng kích thước của 2 mảng số nguyên đã cho.
        //Viết chương trình gộp giá trị của 2 mảng đã cho vào mảng thứ 3
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("---START PROGRAMMING---");
    
        System.out.print("Enter number 1: ");
        int arrayNumber1 = scanner.nextInt();
        int[] arrays1 = new int[arrayNumber1];
        
        for (int i = 0 ; i < arrays1.length; i ++) {
            System.out.print("arrays1["+i+"] : ");
            arrays1[i] = scanner.nextInt();
        }
    
        System.out.print("Enter number 2: ");
        int arrayNumber2 = scanner.nextInt();
        int[] arrays2 = new int[arrayNumber2];
        for (int i = 0 ; i < arrays2.length; i ++) {
            System.out.print("arrays2["+i+"] : ");
            arrays2[i] = scanner.nextInt();
        }
    
        System.out.println("---ARRAY OF NUMBER 1-----");
        for (int i = 0 ; i < arrays1.length; i ++) {
            System.out.println("arrays1["+i+"]: " +arrays1[i]);
        }
    
        System.out.println("---ARRAY OF NUMBER 2-----");
        for (int i = 0 ; i < arrays2.length; i ++) {
            System.out.println("arrays2[" + i + "]: " + arrays2[i]);
        }
        
        int[] arrays3 = new int[arrays1.length + arrays2.length];
        for (int i = 0; i < arrays1.length; i ++) {
            arrays3[i] = arrays1[i];
        }
        for (int i = 0; i < arrays2.length; i ++) {
            arrays3[arrays1.length + i] = arrays2[i];
        }
    
        System.out.println("---ARRAY OF NUMBER 3-----");
        for (int i = 0; i < arrays3.length; i ++) {
            System.out.println("arrays3["+i+"]: " +arrays3[i]);
        }
    }
}
