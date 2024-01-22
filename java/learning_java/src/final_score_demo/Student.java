package final_score_demo;

import java.util.Date;

public class Student {
    private int studentId;
    private String studentLastName;
    private String studentName;
    private String gender;
    private Date birthDay;
    private String address;
    private float finalScore;
    private float practiceScore;
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String getStudentLastName() {
        return studentLastName;
    }
    
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Date getBirthDay() {
        return birthDay;
    }
    
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
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
    
    public float getPracticeScore() {
        return practiceScore;
    }
    
    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }
    
    public float getAvgScore() {
        return (this.finalScore * 2 + this.practiceScore) / 3;
    }
    
    public void displayStudentInfo() {
        StringBuilder result = new StringBuilder();
        result.append("studentId: ").append(this.studentId)
                .append(", studentName: ").append(this.studentName)
                .append(", studentLastName: ").append(this.studentLastName)
                .append(", gender: ").append(this.gender)
                .append(", birthDay: ").append(this.birthDay)
                .append(", address: ").append(this.address)
                .append(", finalScore: ").append(this.finalScore)
                .append(", practiceScore: ").append(this.practiceScore)
                .append(", avgScore: ").append(this.getAvgScore());
        System.out.println(result);
    }
}
