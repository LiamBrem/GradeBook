package com.liam;

public class Course {
    String name;
    int minStudents;

    public Course(String name, int minStudents){
        this.name = name;
        this.minStudents = minStudents;
    }

    public boolean isCancelled(){
        return false;
    }

}
