package com.accio.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public ResponseEntity getStudent(@RequestParam("regNo") int regNo)
    {
        Student student = studentService.getStudent(regNo);
        if(student==null)
        {
            return new ResponseEntity<>("Reg number doesnt exist: " , HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student , HttpStatus.FOUND);
    }

    @GetMapping("/get/{id}")
    public Student getStudentByPath(@PathVariable("id") int regNo)
    {
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
//        return "Student added to database:";
    }

    @PutMapping("/update")
    public Student updateAge(@RequestParam("age") int newAge , @RequestParam("regno") int regNo)
    {
        return studentService.updateAge(regNo , newAge);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int regno)
    {
        studentService.deleteStudent(regno);
        return "Student deleted";
    }
}
