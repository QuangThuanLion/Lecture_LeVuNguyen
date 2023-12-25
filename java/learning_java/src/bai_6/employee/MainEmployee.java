package bai_6.employee;

import java.util.Arrays;
import java.util.Comparator;

public class MainEmployee {
    public static void main(String[] args) {
        //a
        Employee employee = new Employee(1, "Harry", "Tran", 200000);
        Employee employee1 = new Employee(10, "Harry1", "Tran", 800000);
        Employee employee2 = new Employee(2, "Harry2", "Tran", 300000);
        Employee employee3= new Employee(3, "Harry3", "Tran",700000);
        Employee employee4 = new Employee(11, "Harry4", "Tran", 500000);
    
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getFullName());
        
        //b
        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;
        employees[3] = employee3;
        employees[4] = employee4;
        
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }
        
        //c
        System.out.println("---EMPLOYEES AFTER ASCENDING ORDER---");
        Arrays.sort(employees, Comparator.comparing(Employee::getId));
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }
    
        System.out.println("---EMPLOYEES AFTER DESCENDING ORDER---");
        Arrays.sort(employees, Comparator.comparingInt(Employee::getId).reversed());
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }
        
        /*int lengthOfEmployees = employees.length;
        for (int i = 0; i < lengthOfEmployees; i ++) {
            for (int j = 0; j < lengthOfEmployees; j ++) {
                 if (employees[j].getId() < employees[i].getId()) {
                     Employee temporaryEmployee = employees[i];
                     employees[i] = employees[j];
                     employees[j] = temporaryEmployee;
                 }
            }
        }
        System.out.println("---EMPLOYEES AFTER ASCENDING ORDER---");
        for (Employee itemEmployee : employees) {
            System.out.println(itemEmployee);
        }*/
    }
}
