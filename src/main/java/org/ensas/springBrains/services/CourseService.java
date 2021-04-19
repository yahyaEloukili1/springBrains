package org.ensas.springBrains.services;

import java.util.List;

import org.ensas.springBrains.dao.CourseRepository;
import org.ensas.springBrains.dao.TopicRepository;
import org.ensas.springBrains.entities.Course;
import org.ensas.springBrains.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	public List<Course> getAllCourses(Long id){
		return courseRepository.findByTopicId(id);
	}
	public Course getTCourseById(Long id){
		return courseRepository.findById(id).get();
	}
	public void createCourse(Course topic){
		courseRepository.save(topic);
	}
	public void updateCourse(Long id,Course topic) {
		courseRepository.save(topic);

		
	}
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
		
	}
}
