package bai_4;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //1.Viết chương trình khởi tạo mảng số nguyên gồm n phần tử khác nhau.
        //2.Chuong trinh hien thi ra phan tu o trong mang
        //3.Chương trình hiển thị ra được phần tử có giá trị lớn nhất va nho nhat và vị trí của phần tử đó o trong mang
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
    
        //1
        int n = scanner.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("number["+i+"] : ");
            numbers[i] = scanner.nextInt();
        }
        
        //2
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers["+i+"]: " + numbers[i]);
        }
        
        //3
        int max = 0;
        int indexMaxOfNUmber = 0;
        
        int min = numbers[0];
        int indexMinOfNumber = 0;
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexMaxOfNUmber = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indexMinOfNumber = i;
            }
        }
    
        System.out.println("Max in numbers: " + max);
        System.out.println("Index of Max in number: " + indexMaxOfNUmber);
    
        System.out.println("Min in numbers: " + min);
        System.out.println("Index of Min in number: " + indexMinOfNumber);
    }
}
