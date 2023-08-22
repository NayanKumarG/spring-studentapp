package com.accio.studentmanagement;

public class Student {

    private int regno;
    private String name;
    private String course;
    private int age;

    public Student() {
    }

    public Student(int regno, String name, String course, int age) {
        this.regno = regno;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
