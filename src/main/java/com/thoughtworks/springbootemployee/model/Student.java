package com.thoughtworks.springbootemployee.model;

public class Student {
    private String age;
    private int id;
    private String status;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student(String age, int id, String status) {
        this.age = age;
        this.id = id;
        this.status = status;
    }
}
