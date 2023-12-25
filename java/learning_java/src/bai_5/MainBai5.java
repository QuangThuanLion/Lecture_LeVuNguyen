package bai_5;

import java.util.Scanner;

public class MainBai5 extends bai_6.Student {
    
    public int sum(int a, int b) {
        return a + b;
    }
    
    public boolean check(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }
    public void khongLamGi(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }
    
    //khong can khoi tao doi tuong
    public static int tich(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        //can khoi tao doi tuong
        MainBai5 demo = new MainBai5();
        int result = demo.sum(6,9);
        System.out.println("result: " + result);

        boolean check = demo.check(10, 11);
        System.out.println("check: " + check);
        
        demo.khongLamGi(90, 100);
    
        //khong can khoi tao doi tuong
        int tich = MainBai5.tich(5, 5);
        System.out.println(tich);
        
        Student tinhTongStudent = new Student();
        int i = tinhTongStudent.totalStudent(5, 3);
        System.out.println(i);
    
        MainBai5 mainBai5 = new MainBai5();
        mainBai5.address3 = "Quang Tri";
    }
}
