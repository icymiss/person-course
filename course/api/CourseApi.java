package com.example.lab_b03_re_redo.course.api;

import com.example.lab_b03_re_redo.course.CourseServiceImpl;
import com.example.lab_b03_re_redo.course.data.CreateCourseData;
import com.example.lab_b03_re_redo.course.dto.CourseDetailResponseDto;
import com.example.lab_b03_re_redo.course.dto.CreateCourseRequestDto;
import com.example.lab_b03_re_redo.course.servcie.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseApi {
    private final CourseServiceImpl courseServiceImpl;

    public CourseApi(CourseServiceImpl courseServiceImpl){
        this.courseServiceImpl=courseServiceImpl;
    }

    @PostMapping()
    public CourseDetailResponseDto createCourse(@RequestBody CreateCourseRequestDto courseRequestDto){
       CreateCourseData courseData = new CreateCourseData(courseRequestDto);
       return new CourseDetailResponseDto(courseServiceImpl.createCourse(courseData));
    }


}
