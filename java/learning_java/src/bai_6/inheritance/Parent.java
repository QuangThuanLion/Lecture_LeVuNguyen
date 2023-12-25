package bai_6.inheritance;

public class Parent {
    private int productId;
    protected String productName;
    
    public void setProductId(int productIdValue) {
        this.productId = productIdValue;
    }
    
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductName() {
        return this.productName;
    }
}
