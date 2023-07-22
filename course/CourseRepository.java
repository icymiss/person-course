package com.example.lab_b03_re_redo.course;

import com.example.lab_b03_re_redo.course.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends CrudRepository<CourseEntity, String>{
}
