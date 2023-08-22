package com.accio.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo) {

        return studentRepository.getStudent(regNo);
    }

    public String addStudent(Student student) {

        studentRepository.addStudent(student);
        return "Student added Successfully";
    }

    public Student updateAge(int regNo, int newAge) {

        return studentRepository.updateAge(regNo , newAge);
    }

    public void deleteStudent(int regno) {
        studentRepository.deleteStudent(regno);
    }
}
