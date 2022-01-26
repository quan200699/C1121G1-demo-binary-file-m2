package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1,", "Quan", "HN", new Clazz("1","C06")));
        students.add(new Student("2,", "Binh", "NA", new Clazz("2","C11")));
        students.add(new Student("3,", "Viet", "HN", new Clazz("1","C06")));
        writeToFile(students);
        students.add(new Student("4,", "Tinh", "HN", new Clazz("2","C06")));
        writeToFile(students);
        List<Student> newStudents = readFile();
        for (Student student : newStudents) {
            System.out.println(student);
        }
        List<Clazz> clazzes = new ArrayList<>();
        clazzes.add(new Clazz("1","C06"));
        clazzes.add(new Clazz("2","C11"));
        try {
            OutputStream os = new FileOutputStream("class.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(clazzes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> readFile() {
        List<Student> newStudents = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            newStudents = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newStudents;
    }

    private static void writeToFile(List<Student> students) {
        try {
            OutputStream os = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
