package com.example.lab_b03_re_redo.course.dto;

import com.example.lab_b03_re_redo.course.data.CourseDetailData;
import com.example.lab_b03_re_redo.person.data.PersonResponseData;
import com.example.lab_b03_re_redo.person.dto.PersonResponseDto;

import java.util.ArrayList;
import java.util.List;

public class CourseDetailResponseDto {
    private String courseId;

    private String name;

    private Double price;

    private PersonResponseDto teacher;  //頭先卡住，因為我在person的名和題目不一樣

    private List<PersonResponseDto> students;

    public CourseDetailResponseDto(CourseDetailData courseData){
        this.courseId=courseData.getCourseId();
        this.name=courseData.getName();
        this.price=courseData.getPrice();
        this.teacher=new PersonResponseDto(courseData.getTeacher());
        this.students= new ArrayList<>();
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

    public PersonResponseDto getTeacher() {
        return teacher;
    }

    public void setTeacher(PersonResponseDto teacher) {
        this.teacher = teacher;
    }

    public List<PersonResponseDto> getStudents() {
        return students;
    }

    public void setStudents(List<PersonResponseDto> students) {
        this.students = students;
    }
}
