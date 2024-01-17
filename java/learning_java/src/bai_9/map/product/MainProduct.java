package bai_9.map.product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProduct {
    public static void main(String[] args) throws ParseException {
        // xay dung chuong trinh quan li gio hang theo menu, neu gio hang lon hon 5 san pham --> ket thuc chuong trinh
        
        //1.Chương trình cho phép thêm sản phẩm vào giỏ hàng (5 san pham) voi thong tin tu nguoi dung nhap vao
        //Một giỏ hàng không được có 2 sản phầm trùng nhau.
        
        //2. show toan bo thong tin san pham cua gio hang, danh sách sản phẩm được sắp xếp giảm dần theo giá.
        //3. update thong tin gio hang theo Id san pham tu nguoi dung nhap vao
        //4. delete thong tin san pham trong gio hang voi id san pham nguoi dung nhap vao
        //5. tim kiem thong tin san pham voi id san pham nguoi dung nhap vao
        //6. clear toan bo gio hang
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("---CART MANAGEMENT---");
        Map<Integer, Product> products = new HashMap<>();
        
        MainProduct mainProduct = new MainProduct();
        for (int i = 1; i <= 2; i ++) {
            System.out.println("---ADD PRODUCT TO CART---");
            System.out.print("productId: ");
            int productId = scanner.nextInt();
            scanner.nextLine();
    
            Product product = mainProduct.createProduct(productId);
            products.put(productId, product);
        }
        
        //2 show toan bo thong tin san pham cua gio hang, danh sách sản phẩm được sắp xếp giảm dần theo giá.
        mainProduct.showProduct(products);
    
        //3. update thong tin gio hang theo Id san pham tu nguoi dung nhap vao
        System.out.println("--UPDATE INFORMATION PRODUCT---");
        System.out.print("productId: ");
        int productIdUpdate = scanner.nextInt();
        boolean containsKey = products.containsKey(productIdUpdate);
        if (containsKey) {
            Product productUpdate = mainProduct.createProduct(productIdUpdate);
            products.replace(productIdUpdate, productUpdate);
            System.out.println("--PRODUCT AFTER UPDATED--");
            mainProduct.showProduct(products);
        } else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }
        
        //4. delete thong tin san pham trong gio hang voi id san pham nguoi dung nhap vao
        System.out.println("--DELETE PRODUCT--");
        String idProductDelete = scanner.nextLine();
    
        boolean existProductDelete = products.containsKey(idProductDelete);
        if (existProductDelete) {
            products.remove(idProductDelete);
            System.out.println("--PRODUCT AFTER REMOVE--");
            mainProduct.showProduct(products);
        } else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }
        
        //5. tim kiem thong tin san pham voi id san pham nguoi dung nhap vao
        System.out.println("--SEARCH PRODUCT--");
        String idProductSearch = scanner.nextLine();
    
        boolean existProductSearch = products.containsKey(idProductDelete);
        if (existProductSearch) {
            Product productSearch = products.get(idProductSearch);
            productSearch.displayInformationProduct();
        } else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }
    
        //6. clear toan bo gio hang
        products.clear();
        System.out.println("--PRODUCT AFTER CLEAR--: " + products.size());
    }
    
    private void showProduct(Map<Integer, Product> products) {
        List<Product> productsAfterUpdated = products.values().stream().collect(Collectors.toList());
        productsAfterUpdated.sort(Comparator.comparingDouble(Product::getProductPrice).reversed());
        for(Product product : productsAfterUpdated) {
            product.displayInformationProduct();
        }
    }
    
    private Product createProduct(int productId) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("productName:");
        String productName = scanner.nextLine();
    
        System.out.print("productYear: ");
        String productYear = scanner.nextLine();
    
        System.out.print("productPrice:");
        double productPrice = scanner.nextDouble();
    
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);
    
        SimpleDateFormat pattern = new SimpleDateFormat("yyyy/MM/dd");
        Date dateParse = pattern.parse(productYear);
        product.setProductYear(dateParse);
        
        return product;
    }
}
