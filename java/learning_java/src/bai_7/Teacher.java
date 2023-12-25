package bai_7;

public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String display() {
        return super.display().concat("Salary: ").concat(String.valueOf(this.salary));
    }
}
