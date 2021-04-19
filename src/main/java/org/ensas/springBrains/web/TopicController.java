package org.ensas.springBrains.web;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ensas.springBrains.entities.Topic;
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
public class TopicController {

	@Autowired
	private TopicService topicService;
	@GetMapping("/topics")
	public List<Topic> topics() {
	
		return topicService.getAllTopics();
	}
	@PostMapping("/topics")
	public void create(@RequestBody Topic topic) {
	
		 topicService.createTopic(topic);;
	}
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable Long id) {
		return topicService.getTopicById(id);
	}
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable Long id) {
		 topicService.updateTopic(id,topic);
	}
	@DeleteMapping("/topics/{id}")
	public void updateTopic(@PathVariable Long id) {
		 topicService.deleteTopic(id);
	}
}
