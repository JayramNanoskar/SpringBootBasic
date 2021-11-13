package com.jayram.courseapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jayram.courseapi.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("javascript", "Javascript", "Javascript Description"),
			new Topic("java", "Java", "Java Description"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
