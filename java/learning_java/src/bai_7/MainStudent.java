package bai_7;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Harry Potter", 10, "Hogwarts", 4.0);
        
        System.out.println(student.getGpa());
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getAge());
    
        System.out.println("---STUDENT INFORMATION--");
        System.out.println(student.display());
    }
}
