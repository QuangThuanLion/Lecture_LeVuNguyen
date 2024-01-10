package bai_9.student;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        //. student class "A01", "A02"
        
        
        //add
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setStudentName("nguyen van A");
        student1.setAddress("DN");
        student1.setStudentClass("A01");
        student1.setFinalScore(9.5f);
        
        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setStudentName("nguyen van B");
        student2.setAddress("HN");
        student2.setFinalScore(4.2f);
        student2.setStudentClass("A02");
        
        Student student3 = new Student();
        student3.setStudentId(3);
        student3.setStudentName("nguyen van C");
        student3.setAddress("DN");
        student3.setFinalScore(8);
        student3.setStudentClass("A02");
        
        Student student4 = new Student();
        student4.setStudentId(4);
        student4.setStudentName("nguyen van D");
        student4.setAddress("HCM");
        student4.setFinalScore(4.9f);
        student4.setStudentClass("A01");
    
        Student student5 = new Student();
        student5.setStudentId(5);
        student5.setStudentName("nguyen van E");
        student5.setAddress("DN");
        student5.setFinalScore(7f);
        student5.setStudentClass("A02");
        
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        
        //show student
        for(Student student : students) {
            student.displayStudentInfo();
        }
    
        //update studentId = 4
        for (Student student : students) {
            if (student.getStudentId() == 4) {
                student.setStudentName("Nguyen Van D update");
                student.setStudentClass("A02");
                student.setAddress("HN");
                student.setFinalScore(5.8f);
                break;
            }
        }
        
        //update studentId = 5
        for (Student student : students) {
            if (student.getStudentId() == 5) {
                Student studentUpdate = new Student();
                studentUpdate.setStudentId(5);
                studentUpdate.setStudentName("Nguyen Van E update");
                studentUpdate.setStudentClass("A01");
                studentUpdate.setAddress("HN");
                studentUpdate.setFinalScore(8.2f);
    
                int lastIndexOf = students.indexOf(student);
                students.set(lastIndexOf, studentUpdate);
                break;
            }
        }
    
        System.out.println("--STUDENT AFTER UPDATE STUDENT_ID = 4 -----");
        for(Student student : students) {
            student.displayStudentInfo();
        }
        
        //delete studentId = 3
        for(Student student : students) {
            if (student.getStudentId() == 3) {
                students.remove(student);
                break;
            }
        }
        System.out.println("--STUDENT AFTER REMOVE STUDENT_ID = 3 ------");
        for(Student student : students) {
            student.displayStudentInfo();
        }
        
        // Xóa Sinh viên theo index của nó trong tập hợp.
        //delete studentId = 5
        for (Student student : students) {
            if (student.getStudentId() == 5) {
                int indexOfStudent = students.indexOf(student);
                students.remove(indexOfStudent);
                break;
            }
        }
        System.out.println("--STUDENT AFTER REMOVE STUDENT_ID = 5 ------");
        for(Student student : students) {
            student.displayStudentInfo();
        }
        
        //tim kiem theo ten sinh vien tra ve kieu du lieu co hay khong
        //In thong tin ten sinh vien vua tim ra man hinh
        //neu co thi xuat hien ra con khong thi bao khong the tim thay
        String studentName = "nguyen van B1";
        Student studentExist = null;
        for (Student student : students) {
            if (student.getStudentName().equals(studentName)) {
                studentExist = student;
                break;
            }
        }
    
        System.out.println("---INFORMATION OF STUDENT: " + studentName + " -----");
        if (studentExist != null) {
            studentExist.displayStudentInfo();
        } else {
            System.out.println("Student name: " + studentName + " not exits in student list");
        }
    }
}
