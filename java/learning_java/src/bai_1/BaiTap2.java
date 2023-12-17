package bai_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter you birthDay: ");
        int birthDay = scanner.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
    
        System.out.println("year: " + currentYear);
        System.out.println("birthDay: " + birthDay);
        System.out.println("Your birthDay: " + (currentYear - birthDay));
    }
}
