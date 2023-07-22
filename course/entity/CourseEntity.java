package com.example.lab_b03_re_redo.course.entity;

import com.example.lab_b03_re_redo.course.data.CreateCourseData;
import com.example.lab_b03_re_redo.person.entity.PersonEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "course")
public class CourseEntity {
    @Id
    private String courseId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn
    private PersonEntity teacher;

    @ManyToMany
    @Column(nullable = false)
    private List<PersonEntity> students;

    public CourseEntity(){}


    public CourseEntity(CreateCourseData courseData, PersonEntity teacher){
        this.courseId=courseData.getCourseId();
        this.name=courseData.getName();
        this.price=courseData.getPrice();
        this.teacher=teacher;
       // this.students=List<PersonEntity>;   // students 點算？？
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PersonEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonEntity teacher) {
        this.teacher = teacher;
    }

    public List<PersonEntity> getStudents() {
        return students;
    }

    public void setStudents(List<PersonEntity> students) {
        this.students = students;
    }
}
