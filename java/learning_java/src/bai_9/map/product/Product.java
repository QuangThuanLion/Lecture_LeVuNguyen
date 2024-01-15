package bai_9.map.product;

import java.util.Date;

public class Product {
    private int productId;
    private String productName;
    private Date productYear;
    private double productPrice;
    
    public Product() {
    }
    
    public Product(int productId, String productName, Date productYear, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productYear = productYear;
        this.productPrice = productPrice;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public Date getProductYear() {
        return productYear;
    }
    
    public void setProductYear(Date productYear) {
        this.productYear = productYear;
    }
    
    public double getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public void displayInformationProduct() {
        StringBuilder result = new StringBuilder();
        result.append("productId: ").append(this.productId)
                .append(", productName: ").append(this.productName)
                .append(", productYear: ").append(this.productYear)
                .append(", productPrice: ").append(this.productPrice);
        System.out.println(result);
    }
}
