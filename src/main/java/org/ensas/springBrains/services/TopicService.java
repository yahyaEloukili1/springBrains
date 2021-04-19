package org.ensas.springBrains.services;

import java.util.List;

import org.ensas.springBrains.dao.TopicRepository;
import org.ensas.springBrains.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	public List<Topic> getAllTopics(){
		return topicRepository.findAll();
	}
	public Topic getTopicById(Long id){
		return topicRepository.findById(id).get();
	}
	public void createTopic(Topic topic){
		topicRepository.save(topic);
	}
	public void updateTopic(Long id,Topic topic) {
		topicRepository.save(topic);

		
	}
	public void deleteTopic(Long id) {
		topicRepository.deleteById(id);
		
	}
}
