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
}
