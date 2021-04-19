package org.ensas.springBrains.dao;

import java.util.List;

import org.ensas.springBrains.entities.Course;
import org.ensas.springBrains.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

	public List<Course> findByTopicId(Long id);
}
