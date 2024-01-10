package bai_9.student;

public class Student {
    private int studentId;
    private String studentName;
    private String studentClass;
    private String address;
    private float finalScore;
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentClass() {
        return studentClass;
    }
    
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public float getFinalScore() {
        return finalScore;
    }
    
    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }
    public void displayStudentInfo() {
        StringBuilder result = new StringBuilder();
        result.append("studentId: ").append(this.studentId)
                .append(", studentName: ").append(this.studentName)
                .append(", class: ").append(this.studentClass)
                .append(", address: ").append(this.address)
                .append(", finalScore: ").append(this.finalScore);
        
        System.out.println(result);
    }
}
