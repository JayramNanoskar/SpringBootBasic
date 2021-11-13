package com.jayram.courseapidata.dao;

import org.springframework.data.repository.CrudRepository;

import com.jayram.courseapidata.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

	
}
