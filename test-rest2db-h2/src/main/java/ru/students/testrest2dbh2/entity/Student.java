package ru.students.testrest2dbh2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "age")
    private int age;


    public Student() {
    }

    public Student(String name, String surname, String faculty, int age) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }
    
}