package bai_9.product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        
        //Yeu cau:
        //Sử dụng ArrayList của Java Collection Framework,
        // xây dựng một chương trình dùng để quản lý sản phẩm.
        // Sản phẩm sẽ có các thuộc tính sau:
        // ten class: Product
        // 1. mã sản phẩm --> productId --> int ( 1 - 10 )
        // 2. tên sản phẩm --> productName --> String ( Product-A, Product-B..)
        // 3. loại sản phẩm --> categoryProduct --> String (A - B - C - D)
        // 4. giá sản phẩm --> productPrice --> float (5 san pham < 1000, 5 san pham > 1000)
        // 5. tình trạng --> available --> boolean ( true, false )
    
        // 1 constructor de truyen vao du 5 thuoc tinh - 1 constructor khong co tham so
        // method getter va setter
        // function cho moi bai tap
        // Chương trình sẽ có những chức năng chính sau:
    
        //1. Thêm 10 sản phẩm vào tập hop.
        MainProduct mainProduct = new MainProduct();
        List<Product> products = mainProduct.addProductList();
    
        //2. Hiển thị danh sách san pham (available = true --> con hang, available = false --> het hang)
        System.out.println("----SHOW INFORMATION PRODUCT LIST---");
        mainProduct.showProductList(products);
        
        //3. Cập nhật lại thông tin san pham voi san pham co category la B
        // ( cap nhat lai ten san pham - tinh trang  - gia san pham).
        // ten san pham ( ten san pham ban dau_update), gia+100, tinh trang true --> false, false --> true
        mainProduct.updateProductItem(products);
        System.out.println("----SHOW INFORMATION PRODUCT LIST AFTER UPDATED---");
        mainProduct.showProductList(products);
        
        //4. Xoa san pham khoi tap hop neu nhu san pham do tinh trang la false va gia < 1000.
        mainProduct.deleteProductWhichHavePriceLessThan1000AndAvailableIsFalse(products);
        mainProduct.showProductList(products);
        
        //5. Tìm kiếm theo ki tu trong ten san pham neu co thi hien thi san pham do ra, khong thi hien khong ton tai
        List<Product> existProductByName = mainProduct.searchProductByName(products, "A");
        if (!existProductByName.isEmpty()) {
            System.out.println("----EXIST PRODUCT IN PRODUCT LIST---");
            mainProduct.showProductList(existProductByName);
        } else {
            System.out.println("----DON'T HAVE PRODUCT IN PRODUCT LIST---");
        }
    
        //6. Sap xep san pham giam dan theo gia
        mainProduct.sortProductByPriceDescending(products);
        
        //7. hien thi nhung san pham con hang - available == true
        mainProduct.showProductWhichHasAvailableTrue(products);
        
        //8. Xoa toan bo san pham khoi tap hop
        products.clear();
        System.out.println("--SIZE OF PRODUCT LIST AFTER CLEAR---: " + products.size());
    }
    
    private void showProductWhichHasAvailableTrue(List<Product> products) {
        System.out.println("----PRODUCT WHICH HAS AVAILABLE TRUE---");
        for (Product product : products) {
            if (product.isAvailable()) {
                product.displayInformationProduct();
            }
        }
    }
    
    private void sortProductByPriceDescending(List<Product> products) {
        products.sort(Comparator.comparing(Product::getProductPrice).reversed());
        System.out.println("--PRODUCT AFTER SORT BY PRICE DESCENDING--");
        for (Product product : products) {
            product.displayInformationProduct();
        }
    }
    
    private List<Product> searchProductByName(List<Product> products, String keyWordByName) {
        List<Product> existProductByName = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductName().contains(keyWordByName)) {
                existProductByName.add(product);
            }
        }
        return existProductByName;
    }
    
    private void deleteProductWhichHavePriceLessThan1000AndAvailableIsFalse(List<Product> products) {
        List<Product> deletedProducts = new ArrayList<>();
        for (Product product : products) {
            if (!product.isAvailable() && product.getProductPrice() < 1000) {
                deletedProducts.add(product);
            }
        }
        products.removeAll(deletedProducts);
        System.out.println("----PRODUCT LIST AFTER DELETED---");
        System.out.println("size of product after deleted: " + products.size());
    }
    
    private void updateProductItem(List<Product> products) {
        for (Product product : products) {
            if (product.getCategoryProduct().equals("B")) {
                product.setProductName(product.getProductName().concat("_update"));
                product.setProductPrice(product.getProductPrice() + 100f);
                product.setAvailable(!product.isAvailable());
            }
        }
    }
    
    private void showProductList(List<Product> products) {
        for(Product product : products) {
            product.displayInformationProduct();
        }
    }
    
    private List<Product> addProductList() {
        System.out.println("---ADD PRODUCT TO THE LIST---");
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Product-A", "A", 222, true);
        Product product2 = new Product(2, "Product-B", "B", 2000, true);
        Product product3 = new Product(3, "Product-A", "A", 3000, true);
        Product product4 = new Product(4, "Product-A-1", "C", 333, false);
        Product product5 = new Product(5, "Product-E", "C", 4000, true);
        Product product6 = new Product(6, "Product-F", "D", 500, false);
        Product product7 = new Product(7, "Product-A-2", "C", 2500, true);
        Product product8 = new Product(8, "Product-H", "B", 400, false);
        Product product9 = new Product(9, "Product-A", "D", 1000, false);
        Product product10 = new Product(10, "Product-N", "A", 999, false);
        
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        
        return products;
    }
}
