package bai_2;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---PROGRAMMING START----");
    
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        YearMonth yearMonth = YearMonth.of(year, month);
        int lengthOfMonth = yearMonth.lengthOfMonth();
    
        System.out.println("Thang " + month + "/" + year+" co " + lengthOfMonth + " ngay");
        System.out.println("---PROGRAMMING END----");
    }
}
