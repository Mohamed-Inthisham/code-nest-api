package com.blackcode.codenestapi.repository;

import com.blackcode.codenestapi.model.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseContentRepository extends JpaRepository<CourseContent,Long> {
}
