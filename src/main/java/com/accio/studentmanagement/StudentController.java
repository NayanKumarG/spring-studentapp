package com.accio.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public Student getStudent(@RequestParam("regNo") int regNo)
    {
        return studentService.getStudent(regNo);
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
