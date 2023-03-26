package com.driver;

public class Teacher {

    private String teacherName;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }

    public Teacher(String teacherName, int numberOfStudents, int age) {
        this.teacherName = teacherName;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}