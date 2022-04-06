package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopoicService topoicservice;
	
	@RequestMapping("/topics")
	public List<Topic> displayTopic() {
		return topoicservice.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getATopic(@PathVariable String id) {
		return topoicservice.getATopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/topics")
	public String addTopic(@RequestBody Topic topic) {
		topoicservice.addTopic(topic);
		return "Topic created";
		
	}

}
