package bai_12;

public class MainException {
    public static void main(String[] args) {
        int number = 11;
    
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("error 2");
        }
        System.out.println("abc");
    
        int age = 44;
        try {
            if (age < 10) {
                throw new UserException("khong tu tuoi");
            }
            System.out.println("welcome to website");
        } catch (UserException demoException){
            System.out.println(demoException.getMessage());
        }
        
        String numbers = "123";
        try {
            int parseNumber = Integer.parseInt(numbers);
    
            System.out.println(parseNumber);
        } catch (NumberFormatException exception) {
            System.out.println("error");
        }
        System.out.println("end");
    }
}
