package com.example.lab_b03_re_redo.course.servcie;

import com.example.lab_b03_re_redo.course.CourseRepository;
import com.example.lab_b03_re_redo.course.data.CourseDetailData;
import com.example.lab_b03_re_redo.course.data.CreateCourseData;
import org.springframework.stereotype.Service;


public interface CourseService {
    CourseDetailData createCourse(CreateCourseData courseData);


}
