package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URL;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cTitle;
    private String cDescription;
    private String companyName;
    private URL image;
    @JoinTable(name = "student_courses",joinColumns = @JoinColumn(name = "courseId"),
    inverseJoinColumns = @JoinColumn(name = "studentId"))
    @ManyToMany
    private List<Student> students;
    @OneToMany(mappedBy = "course")
    private List<Quiz> quizzes;
    @OneToMany(mappedBy = "course")
    private List<Certificate> certificates;
    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "course")
    private List<CourseContent> courseContents;
}
