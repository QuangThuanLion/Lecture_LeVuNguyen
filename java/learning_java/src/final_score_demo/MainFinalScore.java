package final_score_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainFinalScore {
    public static void main(String[] args) {
        //1
        System.out.println("---PROGRAMING START---");
    
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setStudentId(111);
        students.add(student);
    
        for (int i = 0; i <5; i ++) {
            int studentId;
            boolean duplicateStudentId = true;
            do {
                System.out.print("studentId: ");
                studentId = scanner.nextInt();
                try {
                    for (Student item : students) {
                        if (item.getStudentId() == studentId) {
                            throw new UserException("StudentId cannot duplicate");
                        }
                    }
                    duplicateStudentId = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (duplicateStudentId);
            scanner.nextLine();
            System.out.println("studentId: " + studentId);
    
            String gender = "";
            boolean validationGender = true;
            do {
                System.out.print("gender: ");
                gender = scanner.nextLine();
                try {
                    if (!gender.equals("male") && !gender.equals("female")) {
                        throw new UserException("Gender not validation");
                    }
                    validationGender = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (validationGender);
            System.out.println("gender: " + gender);
        }
        
        //show
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String studentNameO1 = o1.getStudentName();
                String studentNameO2 = o2.getStudentName();
                
                if (studentNameO1.equals(studentNameO2)) {
                    String lastNameO1 = o1.getStudentLastName();
                    String lastNameO2 = o2.getStudentLastName();
                    
                    //1: o1 > 02
                    //-1: o1 < 02
                    //0: o1 == o2
                    return lastNameO1.compareTo(lastNameO2);
                } else {
                    return studentNameO1.compareTo(studentNameO2);
                }
            }
        });
    }
}
