package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    HashMap<String,Student> studentDb = new HashMap<>();
    HashMap<String,Teacher> teacherDb = new HashMap<>();
    HashMap<String, List<String>> studentTeacherDb = new HashMap<>();

    public void addStudent(Student student)
    {
        String key = student.getName();
        studentDb.put(key,student);
    }

    public void addTeacher(Teacher teacher)
    {
        String key = teacher.getName();
        teacherDb.put(key,teacher);
    }

    public void addStudentTeacherPair(String student, String teacher)
    {
        if(studentTeacherDb.containsKey(teacher))
        {
            studentTeacherDb.get(teacher).add(student);
        }
        else
        {
            List<String> list = new ArrayList<>();
            list.add(student);
            studentTeacherDb.put(teacher,list);
        }
    }

    public Student getStudentByName(String name)
    {
        return studentDb.get(name);
    }

    public Teacher getTeacherByName(String name)
    {
        return teacherDb.get(name);
    }

    public void deleteTeacherByName(String name)
    {
        List<String> student = studentTeacherDb.get(name);

        for (String s : student)
        {
            studentDb.remove(s);
        }
        teacherDb.remove(name);
        studentTeacherDb.remove(name);
    }

    public void deleteAllTeachers()
    {
        List<String> studentName = new ArrayList<>();
        for(List<String> list: studentTeacherDb.values())
        {
            for(String s: list)
            {
                studentName.add(s);
            }
        }

        for(String s: studentName)
        {
            studentDb.remove(s);
        }

        teacherDb.clear();
        studentTeacherDb.clear();
    }
}
