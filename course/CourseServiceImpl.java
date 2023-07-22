package com.example.lab_b03_re_redo.course;


import com.example.lab_b03_re_redo.course.data.CourseDetailData;
import com.example.lab_b03_re_redo.course.data.CreateCourseData;
import com.example.lab_b03_re_redo.course.entity.CourseEntity;
import com.example.lab_b03_re_redo.course.servcie.CourseService;
import com.example.lab_b03_re_redo.person.entity.PersonEntity;
import com.example.lab_b03_re_redo.person.serviceImpl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final PersonServiceImpl personServiceImpl;

    public CourseServiceImpl(CourseRepository courseRepository, PersonServiceImpl personServiceImpl){
        this.courseRepository=courseRepository;
        this.personServiceImpl =personServiceImpl;
    }
//why is not autowire? is override? when I type in autowired, "no beans of CreateCourseData type found"
@Override
    public CourseDetailData createCourse(CreateCourseData courseData){
      PersonEntity teacherEntity = personServiceImpl.getPersonEntityByHkid(courseData.getTeacherHkid());
      CourseEntity courseEntity = new CourseEntity(courseData, teacherEntity);
      courseRepository.save(courseEntity);
      return new CourseDetailData(courseEntity);
    }
}