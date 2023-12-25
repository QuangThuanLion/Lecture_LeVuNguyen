package bai_6.inheritance;

public class Children extends Parent {
    private int childId;
    
    public Children() {
    }
    
    public Children (int childIdValue, String productName) {
        this.childId = childIdValue;
    }
    
    public void setChildId(int childIdValue) {
        this.childId = childIdValue;
    }
    
    public int getChildId() {
        return this.childId;
    }
}
