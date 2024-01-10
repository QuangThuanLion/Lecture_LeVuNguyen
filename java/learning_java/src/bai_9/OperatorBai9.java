package bai_9;

import java.util.ArrayList;
import java.util.List;

public class OperatorBai9 {
    public static void main(String[] args) {
        // Create new List String ( products)
        //1. add element into the list (samsung, iphone, nokia, oppo, vivo)
        //2. print all products in list products
        //3. update samsung --> samsung_update
        //4. add element between iphone and nokia (asus)
        //5. remove oppo in product list
        //6. clear all list product
    
        List<String> products = new ArrayList<>();
        products.add("samsung");
        products.add("iphone");
        products.add("nokia");
        products.add("oppo");
        products.add("vivo");
        
        products.forEach(product -> {
            System.out.println(product);
        });
        
        products.set(0, "samsung_update");
        products.add(2, "asus");
        System.out.println("--PRODUCT AFTER UPDATE--");
        products.forEach(product -> {
            System.out.println(product);
        });
        products.remove("oppo");
        products.clear();
    
        System.out.println("Size of product list: " + products.size());
    }
}
