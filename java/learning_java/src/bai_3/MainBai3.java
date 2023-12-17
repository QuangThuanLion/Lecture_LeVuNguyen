package bai_3;

public class MainBai3 {
    
    //for dieu kien - for truyen thong
    public static void main(String[] args) {
          for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break;
//            }
            if (i == 5) {
                continue;
            }
            System.out.println("item: " + i);
        }
        
        //while
        int number = 1;
        while(number <= 10) {
            System.out.println("number: " + number);
            number++;
        }
        
        //do-while
        int productId = 10;
        do {
            System.out.println("do-while: " + productId);
        } while (productId > 11);
    }
}
