package com.jayram.courseapidata.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jayram.courseapidata.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
	
	
}
