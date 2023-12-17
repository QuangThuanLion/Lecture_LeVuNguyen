package bai_2;

public class MainBai2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        
        if (a < b) {
            System.out.println("a < b: success");
        } else {
            System.out.println("a < b : failed");
        }
        
        if (a > b || a  == 2) {
            System.out.println("a > b || a  == 1 is True");
        } else if (a < b && b == 10) {
            System.out.println("a < b && b == 10 is true");
        }
        
        //SWITCH-CASE
        //khong su dung cho truong hop so sanh <><=>=
        //no chi su dung de so sanh bang hoac phu dinh lai
        String name = "admin";
        switch (name) {
            case "admin1": {
                System.out.println("admin1 is true");
                break;
            }
            case "admin": {
                System.out.println("admin is true");
            }
            case "admin2": {
                System.out.println("admin2 is true");
                break;
            }
            default: {
                System.out.println("default");
            }
        }
        
        //toan tu 3 ngoi
        int number1 = 1;
        int number2 = 20;
        int number3 = 54;
        if (number1 < number2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(number1 < number2 ? (number1 > number3 ? "isTrue" : "isFalse") : "false");
    }
}
