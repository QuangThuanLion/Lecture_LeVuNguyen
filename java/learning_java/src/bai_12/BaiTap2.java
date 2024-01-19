package bai_12;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        //Viết một chương trình cho phép tạo ra một mảng 10 số nguyên ngẫu nhiên.
        // Cho phép người dùng nhập vào chỉ số của một phần tử và hiển thị giá trị của phần tử đó.
        //Sử dụng try-catch để hiển thị thông báo nếu người dùng nhập vào chỉ số không hợp lệ (index < 0 hoặc index >= 100)
        
        int[] numbers = new int[10];
        numbers[0] = 22;
        numbers[1] = 55;
        numbers[2] = 543;
        numbers[3] = 45;
        numbers[4] = 65;
        numbers[5] = 99;
        numbers[6] = 3442;
        numbers[7] = 123;
        numbers[8] = 6455;
        numbers[9] = 54;
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("index of number: ");
        int indexOfNumber = scanner.nextInt();
    
        try {
            int number = numbers[indexOfNumber];
            System.out.println(number);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("error");
        }
    }
}
