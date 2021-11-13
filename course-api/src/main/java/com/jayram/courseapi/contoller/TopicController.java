package com.jayram.courseapi.contoller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayram.courseapi.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("javascript", "Javascript", "Javascript Description"),
				new Topic("java", "Java", "Java Description"));
	}
}
