package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopoicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("sprong","Sprong Framework","Sprong Framework Description"),
			 new Topic("java"," java framework","Java Framework Description"),
			 new Topic("javascript","Javascript Framework","Javascript Framework Description")
));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getATopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public String updateTopic(String id, Topic topic) {
		 for(int i=0;i<topics.size();i++)
		 {
			 Topic t = topics.get(i);
			 if(t.getId().equals(id)){
				 topics.set(i,topic);
				 return "Updated Topic";
			 }
			 
		 }
		 
		 return "No corresponding topic Found";
	}

	public String deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		return "Topic Deleted";
		
	}

}
