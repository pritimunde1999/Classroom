package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Repository
public class StudentRepository {

    HashMap<String,Student> studentDb = new HashMap<>();
    HashMap<String,Teacher> teacherDb = new HashMap<>();
    HashMap<String,String> studentTeacherDb = new HashMap<>();

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
        studentTeacherDb.put(student, teacher);
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
        for(Map.Entry<String,String> entry : studentTeacherDb.entrySet())
        {
            if(entry.getValue().equals(name))
            {
                String student = entry.getKey();
                studentDb.remove(student);
                studentTeacherDb.remove(student);
            }
        }
       teacherDb.remove(name);
    }

    public void deleteAllTeachers()
    {
        Iterator<Map.Entry<String, String>> iterator = studentTeacherDb.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (studentDb.containsKey(entry.getValue())) {
                iterator.remove();
                studentDb.remove(entry.getKey());
            }
        }
        teacherDb.clear();
    }
}
