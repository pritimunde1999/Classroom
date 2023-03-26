package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student)
    {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher)
    {
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher)
    {
        studentRepository.addStudentTeacherPair(student,teacher);
    }

    public Student getStudentByName(String name)
    {
        return studentRepository.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name)
    {
        return studentRepository.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String name)
    {
        HashMap<String,List<String>> hm = studentRepository.studentTeacherDb;
        return hm.get(name);
    }

    public List<String> getAllStudents()
    {
        HashMap<String,Student> hm = studentRepository.studentDb;

        List<String> ans = new ArrayList<>();

        for(String student: hm.keySet())
        {
            ans.add(student);
        }

        return ans;
    }

    public void deleteTeacherByName(String name)
    {
        studentRepository.deleteTeacherByName(name);
    }

    public void deleteAllTeachers()
    {
        studentRepository.deleteAllTeachers();
    }
}
