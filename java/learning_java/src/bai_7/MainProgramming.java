package bai_7;

import java.util.Arrays;
import java.util.Comparator;

public class MainProgramming {
    public static void main(String[] args) {
        //2.a Nhập thông tin 5 Student, 5 Teacher vào mảng
        Student[] students = new Student[5];
        Student student= new Student("Nguyen Van A", 20, "Ha Noi", 8.0);
        Student student1 = new Student("Nguyen Van B", 21, "Ha Noi", 9.0);
        Student student2 = new Student("Nguyen Van C", 22, "Ha Noi", 7.0);
        Student student3 = new Student("Nguyen Van D", 23, "Ha Noi", 6.0);
        Student student4 = new Student("Nguyen Van E", 24, "Ha Noi", 5.0);
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        
        Teacher[] teachers = new Teacher[5];
        Teacher teacher = new Teacher("Nguyen Van A", 20, "Ha Noi", 120);
        Teacher teacher1 = new Teacher("Nguyen Van B", 21, "Ha Noi", 250);
        Teacher teacher2 = new Teacher("Nguyen Van C", 22, "Ha Noi", 100);
        Teacher teacher3 = new Teacher("Nguyen Van D", 23, "Ha Noi", 500);
        Teacher teacher4 = new Teacher("Nguyen Van E", 24, "Ha Noi", 550);
        teachers[0] = teacher;
        teachers[1] = teacher1;
        teachers[2] = teacher2;
        teachers[3] = teacher3;
        teachers[4] = teacher4;
        
        //2.Hiển thị danh sách thông tin Student vừa nhập
        for(Student itemStudent : students) {
            System.out.println("---INFORMATION STUDENT---");
            String studentInformation = itemStudent.display();
            System.out.println(studentInformation);
        }
    
        //3.Hiển thị danh sách thông tin Teader vừa nhập
        for(Teacher itemTeacher : teachers) {
            System.out.println("---INFORMATION TEACHER---");
            String studentInformation = itemTeacher.display();
            System.out.println(studentInformation);
        }
    
        //d. Hiển thị top 3 những Teacher có lương cao nhất
        System.out.println("---TOP 3 TEACHER HAVE HIGHER SALARY---");
        Arrays.sort(teachers, Comparator.comparingInt(Teacher::getSalary).reversed());
        Teacher[] higherSalaryTeachers = new Teacher[3];
        for(int i = 0 ; i < teachers.length; i++) {
            if (i == 3) {
                break;
            }
            higherSalaryTeachers[i] = teachers[i];
        }
        for(Teacher itemTeacher : higherSalaryTeachers) {
            itemTeacher.displayHigherSalary();
        }
    
        //e. Hiển thị 3 những Student có độ tuổi nhỏ nhất
        System.out.println("---TOP 3 STUDENT HAVE THE AGE IS LESS---");
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
        Student[] lessAgeStudents = new Student[3];
        for (int i = 0; i < students.length; i ++) {
            if (i == 3) {
                break;
            }
            lessAgeStudents[i] = students[i];
        }
        for (Student itemStudent : lessAgeStudents) {
            itemStudent.displayLessThanAge();
        }
    }
}
