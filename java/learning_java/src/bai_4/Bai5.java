package bai_4;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Viết chương trình thực hiện các công việc như sau :
        //a. Nhập một mảng a gồm n phần tử kiểu nguyên int
        //b. Tính tổng số dương lẻ mảng a
        //c. Nhập phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra phần tử ở vi tri index thu may
        //d. Sắp sếp mảng a theo thứ tự tăng dần
        //e. Chèn phần tử p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần và xuất lại mảng
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        
        // Tính tổng số dương lẻ mảng a
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum of positive odd numbers in the array: " + sum);
        
        // Nhập phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra phần tử ở vị trí index thứ mấy
        System.out.print("Enter a number to search: ");
        int k = scanner.nextInt();
        
        int check = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                check = i;
                break;
            }
        }
        if (check != -1) {
            System.out.println(k + " is found at index " + check);
        } else {
            System.out.println(k + " is not found in the array");
        }
        
        // Sắp xếp mảng a theo thứ tự tăng dần
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        
        // Chèn phần tử p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần và xuất lại mảng
        System.out.print("Enter a number to insert: ");
        int p = scanner.nextInt();
        int[] newArray = new int[n + 1];
        int i = 0;
        while (i < n && a[i] < p) {
            newArray[i] = a[i];
            i++;
        }
        newArray[i] = p;
        while (i < n) {
            newArray[i + 1] = a[i];
            i++;
        }
        System.out.println("Array after inserting " + p + ": " + Arrays.toString(newArray));
    }
}
