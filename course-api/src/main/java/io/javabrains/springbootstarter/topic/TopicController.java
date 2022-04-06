package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> displayTopic() {
		return Arrays.asList(new Topic("sprong","Sprong Framework","Sprong Framework Description"),
							 new Topic("java"," java framework","Java Framework Description"),
							 new Topic("javascript","Javascript Framework","Javascript Framework Description")
				);
		
	}

}
