package bai_6;

public class Student {
    private int studentId;
    private String studentName;
    
    private String address;
    public String address2;
    protected String address3;
    String address4; //default
    
    public void setStudentId(int valueStudentId) {
        studentId = valueStudentId;
        address = "Ha Noi";
    }
    public void setStudentName(String valueStudentName) {
        studentName = valueStudentName;
    }
    
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
}
