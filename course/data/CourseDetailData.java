package com.example.lab_b03_re_redo.course.data;

import com.example.lab_b03_re_redo.course.entity.CourseEntity;
import com.example.lab_b03_re_redo.person.data.PersonResponseData;
import com.example.lab_b03_re_redo.person.entity.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class CourseDetailData {
    private String courseId;

    private String name;

    private Double price;

    private PersonResponseData teacher;  //頭先卡住，因為我在person的名和題目不一樣

    private List<PersonResponseData> students;

    public String getCourseId() {
        return courseId;
    }

    public CourseDetailData(CourseEntity course){
        this.courseId=course.getCourseId();
        this.name=course.getName();
        this.price=course.getPrice();
        this.teacher=new PersonResponseData(course.getTeacher());
        this.students=new ArrayList<PersonResponseData>();    //做到這裏
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

    public PersonResponseData getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonResponseData teacher) {
        this.teacher = teacher;
    }

    public List<PersonResponseData> getStudents() {
        return students;
    }

    public void setStudents(List<PersonResponseData> students) {
        this.students = students;
    }
}
