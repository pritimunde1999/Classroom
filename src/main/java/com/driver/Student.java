package com.driver;

public class Student {

    private String studentName;
    private int age;
    private double averageScore;

    public Student(){

    }

    public Student(String studentName, int age, double averageScore) {
        this.studentName = studentName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
