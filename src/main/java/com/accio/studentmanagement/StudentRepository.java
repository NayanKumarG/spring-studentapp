package com.accio.studentmanagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer , Student> db = new HashMap<>();

    public Student getStudent(int regNo) {
        Student student = db.get(regNo);
        return student;
    }

    public void addStudent(Student student) {
        db.put(student.getRegno() , student);
    }

    public Student updateAge(int regNo, int newAge) {

//        Student student = db.get(regNo);
//        student.setAge(newAge);
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public void deleteStudent(int regno) {

        db.remove(regno);
    }
}
