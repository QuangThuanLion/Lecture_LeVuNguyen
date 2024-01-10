package bai_9.product;

public class Product {
    
    private int productId;
    private String productName;
    private String categoryProduct;
    private float productPrice;
    private boolean available;
    
    public Product() {
    
    }
    
    public Product(int productId, String productName, String categoryProduct, float productPrice, boolean available) {
        this.productId = productId;
        this.productName = productName;
        this.categoryProduct = categoryProduct;
        this.productPrice = productPrice;
        this.available = available;
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
    
    public String getCategoryProduct() {
        return categoryProduct;
    }
    
    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }
    
    public float getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void displayInformationProduct() {
        StringBuilder result = new StringBuilder();
        result.append("productId: ").append(this.productId)
                .append(", productName: ").append(this.productName)
                .append(", categoryProduct: ").append(this.categoryProduct)
                .append(", productPrice: ").append(this.productPrice)
                .append(this.available ? ", available:" : ", unavailable:");
        System.out.println(result);
    }
}
