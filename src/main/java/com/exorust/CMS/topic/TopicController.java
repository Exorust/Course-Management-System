package com.exorust.CMS.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		List<Topic> listing = new ArrayList<Topic>();
		listing.add(new Topic("1","Physics","Basics"));
		listing.add(new Topic("2","Physics2","Basics"));
		listing.add(new Topic("3","Physics3","Basics"));

		return listing;
	}
}
