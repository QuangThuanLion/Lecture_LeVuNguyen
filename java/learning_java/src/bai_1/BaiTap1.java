package bai_1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner_variable = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner_variable.nextLine();

        System.out.print("Your name: " + username);
    }
}
