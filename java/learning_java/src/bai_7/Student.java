package bai_7;

public class Student extends Person {

    private double gpa;
    
    
    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String display() {
        return super.display().concat("GPA: ").concat(String.valueOf(this.gpa));
    }
    public void displayLessThanAge() {
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge());
    }
}
