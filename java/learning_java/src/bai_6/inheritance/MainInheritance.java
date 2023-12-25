package bai_6.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Children children = new Children();
        children.setChildId(10);
        children.setProductId(20);
        children.setProductName("samsung");
    
        System.out.println(children.getChildId());
        System.out.println(children.getProductId());
        System.out.println(children.getProductName());
        
        Children children1 = new Children(40, "acb");
        System.out.println(children1.getChildId());
    }
}
