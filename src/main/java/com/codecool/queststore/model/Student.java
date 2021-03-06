package com.codecool.queststore.model;

public class Student extends User {

    private Integer currentMoney;
    private Integer totalMoney;
    private Integer studentId;
    private Integer studentIdClass;

    public Student(Integer userId, String firstName, String lastName, String phoneNumber, String email,
                   String role) {
        super(userId, firstName, lastName, phoneNumber, email, role);
        this.currentMoney = 0;
        this.totalMoney = 0;
    }

    public Student(Integer userId, String firstName, String lastName, String phoneNumber, String email,
                   String role, Integer studentId, Integer studentIdClass, Integer currentMoney, Integer totalMoney) {
        super(userId, firstName, lastName, phoneNumber, email, role);
        this.studentId = studentId;
        this.currentMoney = currentMoney;
        this.totalMoney = totalMoney;
        this.studentIdClass = studentIdClass;
    }

    public Integer getStudentIdClass() {
        return studentIdClass;
    }

    public void setStudentIdClass(Integer studentIdClass) {
        this.studentIdClass = studentIdClass;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(Integer currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }
}