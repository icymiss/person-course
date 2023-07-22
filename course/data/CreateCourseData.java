package com.example.lab_b03_re_redo.course.data;

import com.example.lab_b03_re_redo.course.dto.CreateCourseRequestDto;

public class CreateCourseData {
    private String courseId;
    private String name;
    private Double price;
    private String teacherHkid;

    public CreateCourseData(CreateCourseRequestDto courseDataDto){
        this.courseId= courseDataDto.getCourseId();
        this.name= courseDataDto.getName();
        this.price=courseDataDto.getPrice();
        this.teacherHkid=courseDataDto.getTeacherHkid();
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

    public String getTeacherHkid() {
        return teacherHkid;
    }

    public void setTeacherHkid(String teacherHkid) {
        this.teacherHkid = teacherHkid;
    }
}
