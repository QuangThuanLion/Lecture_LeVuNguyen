package final_score_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainFinalScore {
    public static void main(String[] args) throws ParseException{
        //1
        System.out.println("---PROGRAMING START---");
    
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    
        for (int i = 0; i < 5; i ++) {
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
    
            String gender;
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
    
            Date birthDay = null;
            boolean validationBirthDay = true;
            do {
                try {
                    System.out.print("birthDay: ");
                    String inputBirthDay = scanner.nextLine();
                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
                    birthDay = format.parse(inputBirthDay);
                    if (birthDay.after(new Date())) {
                        throw new UserException("BirthDay cannot be after current Day !!!");
                    }
                    validationBirthDay = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                } catch (ParseException ex) {
                    System.out.println("Pattern of birthDay invalid");
                }
            } while (validationBirthDay);
            
           float practiceScore = 0;
           boolean validationPracticeScore = true;
           do {
               try {
                   System.out.print("practice score: ");
                   practiceScore = scanner.nextFloat();
                   if (practiceScore < 0 || practiceScore > 10) {
                       throw new UserException("practice score must be less than 10 and greater than 0");
                   }
                   validationPracticeScore = false;
               } catch (UserException ex) {
                   System.out.println(ex.getMessage());
               } catch (InputMismatchException ex) {
                   scanner.nextLine();
                   System.out.println("practice score must be a number");
               }
           } while (validationPracticeScore);
    
            float finalScore = 0;
            boolean validationFinalScore = true;
            do {
                try {
                    System.out.print("finalScore score: ");
                    finalScore = scanner.nextFloat();
                    if (finalScore < 0 || finalScore > 10) {
                        throw new UserException("finalScore score must be less than 10 and greater than 0");
                    }
                    validationFinalScore = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                } catch (InputMismatchException ex) {
                    scanner.nextLine();
                    System.out.println("finalScore score must be a number");
                }
            } while (validationFinalScore);
            scanner.nextLine();
            
            String studentLastName = null;
            boolean validationStudentLastName = true;
            do {
                try {
                    System.out.print("student last name: ");
                    studentLastName = scanner.nextLine();
                    if (studentLastName.isBlank()) {
                        throw new UserException("student last name cannot empty and blank");
                    }
                    validationStudentLastName = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (validationStudentLastName);
    
            String studentName = null;
            boolean validationStudentName = true;
            do {
                try {
                    System.out.print("student name: ");
                    studentName = scanner.nextLine();
                    if (studentName.isBlank()) {
                        throw new UserException("student name cannot empty and blank");
                    }
                    validationStudentName = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (validationStudentName);
    
            String address = null;
            boolean validationAddress = true;
            do {
                try {
                    System.out.print("address: ");
                    address = scanner.nextLine();
                    if (address.isBlank()) {
                        throw new UserException("address cannot empty and blank");
                    }
                    validationAddress = false;
                } catch (UserException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (validationAddress);
            
            Student student = new Student();
            student.setStudentId(studentId);
            student.setAddress(address);
            student.setGender(gender);
            student.setStudentName(studentName);
            student.setStudentLastName(studentLastName);
            student.setPracticeScore(practiceScore);
            student.setFinalScore(finalScore);
            student.setBirthDay(birthDay);
    
            students.add(student);
        }
        
        //2 show
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
        System.out.println("---DISPLAY STUDENTS INFO--");
        for (Student student : students) {
            student.displayStudentInfo();
        }
        
        //3
        System.out.print("enter higher avg score: ");
        float higherAvgScore = scanner.nextFloat();
        for (Student student : students) {
            if (student.getAvgScore() >= higherAvgScore) {
                student.displayStudentInfo();
            }
        }
    
        System.out.print("enter less than avg score: ");
        float lessThanAvgScore = scanner.nextFloat();
        for (Student student : students) {
            if (student.getAvgScore() <= lessThanAvgScore) {
                student.displayStudentInfo();
            }
        }
    
        System.out.println("--LIST OF STUDENT SORT BY AVG SCORE DESCENDING");
        students.sort(Comparator.comparingDouble(Student::getAvgScore).reversed());
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}
