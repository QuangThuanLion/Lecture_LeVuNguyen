package bai_6;

public class MainStudent {
    public static void main(String[] args) {
        Student studentDemo = new Student();
        studentDemo.setStudentId(100);
        studentDemo.setStudentName("Nguyen Van A");
    
        int studentId = studentDemo.getStudentId();
        String studentName = studentDemo.getStudentName();
        System.out.println("studentId: " + studentId);
        System.out.println("studentName: " + studentName);
        
        Student student2 = new Student();
        student2.setStudentId(101);
        student2.setStudentName("nguyen van B");
    
        int studentId2 = student2.getStudentId();
        String studentName2 = student2.getStudentName();
        System.out.println("studentId: " + studentId2);
        System.out.println("studentName: " + studentName2);
        
        Student student3 = new Student();
        student3.address2 = "Hue";
        student3.address3 = "Quang Ninh";
        student3.address4 = "HCM";
        
        //tinh dong goi trong lap trinh huong doi tuong
        //1. private --> chi co the truy xuat truc tiep trong class
        //  ngoai class khong cho truy xuat vao
        //2.public truy xuat o moi noi
        //3. protected --> truy xuat tu ke thua, trong pakage, trong class
        //4. default --> trong class, trong package
    }
}
