package com.blackcode.codenestapi.repository;

import com.blackcode.codenestapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
