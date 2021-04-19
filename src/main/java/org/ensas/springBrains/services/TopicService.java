package org.ensas.springBrains.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ensas.springBrains.entities.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(  Arrays.asList(
			new Topic(1L,"topic 1","desc 1"),
			new Topic(2L,"topic 2","desc 2"),
			new Topic(3L,"topic 3","desc 3")));
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopicById(Long id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void createTopic(Topic topic){
		 topics.add(topic);
	}
	public void updateTopic(Long id,Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				
			}
		}
		
	}
	public void deleteTopic(Long id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
