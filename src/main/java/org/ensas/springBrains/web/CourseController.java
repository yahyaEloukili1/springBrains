package org.ensas.springBrains.web;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ensas.springBrains.entities.Course;
import org.ensas.springBrains.entities.Topic;
import org.ensas.springBrains.services.CourseService;
import org.ensas.springBrains.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/topics/{id}/courses")
	public List<Course> courses(@PathVariable Long id) {
	
		return courseService.getAllCourses(id);
	}
	@GetMapping("/courses/{id}")
	public void getCourse(@PathVariable Long id) {
	
		 courseService.getTCourseById(id);;
	}
	@PostMapping("/topics/{topicId}/courses")
	public void createCourse(@RequestBody Course course,@PathVariable Long topicId) {
		course.setTopic(new Topic(topicId,"",""));
		 courseService.createCourse(course);
	}
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateTopic(@RequestBody Course course,@PathVariable Long topicId,@PathVariable Long id) {
		course.setTopic(new Topic(topicId,"",""));
		 courseService.updateCourse(id,course);
	}
	@DeleteMapping("/courses/{id}")
	public void deleteTopic(@PathVariable Long id) {
		 courseService.deleteCourse(id);
	}
}
