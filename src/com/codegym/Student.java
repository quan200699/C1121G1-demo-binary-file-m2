package com.codegym;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private String hometown;
    private Clazz clazz;

    public Student() {
    }

    public Student(String id, String name, String hometown) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
    }

    public Student(String id, String name, String hometown, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.clazz = clazz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
