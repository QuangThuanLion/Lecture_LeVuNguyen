package bai_3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Viết chương trình nhập vào một số
        //nguyên rồi in ra màn hình tất cả các ước số của số đó
        
        //uoc la so do co the chia het cho nhung so nao
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= number; i ++) {
            if (number % i == 0) {
                System.out.println("uoc cua "+number+" la: " + i);
            }
        }*/
        
        //bai tap them: tim boi cua n nhap vao tu ban phim voi dieu kien
        //boi do nho hon < 1000, tim ra boi cua so nho nhat, va boi so lon < 1000
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        
        int boiLonNhat = 1;
        for (int i = 1; i < 1000; i ++) {
            if (i % number == 0) {
                System.out.println("Boi so cua " +number+" : " + i);
                if (boiLonNhat < i) {
                    boiLonNhat = i;
                }
            }
        }
        System.out.println("boi lon nhat cua "+number+" : " + boiLonNhat);
    }
}
