package bai_7;

public class Person {
    private String name;
    private int age;
    private String address;
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ")
                .append(this.name)
                .append("\n")
                .append("Age: ")
                .append(this.age)
                .append("\n")
                .append("Address: ")
                .append(this.address)
                .append("\n");
        return sb.toString();
    }
}
