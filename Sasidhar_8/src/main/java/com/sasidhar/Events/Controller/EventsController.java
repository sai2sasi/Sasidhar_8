package com.sasidhar.Events.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sasidhar.Events.constants.EventType;
import com.sasidhar.Events.vo.EventsVo;

@RestController
public class EventsController {
	
	@Autowired
	EventService eventService;

	@GetMapping("/getEvents")
	public List<EventsVo> getAllEventsList(@RequestParam("userId")String userId){
		return eventService.getEvents(userId,EventType.ALL);
	}
	
	@GetMapping("/getRegisteredEvents")
	public List<EventsVo> getRegisteredEvents(@RequestParam("userId")String userId){
		
		return eventService.getEvents(userId,EventType.REGISTERED);
	}
	
	@GetMapping("/getUpcomingEvents")
	public List<EventsVo> getUpcomingEvents(@RequestParam("userId")String userId){
		
		return eventService.getEvents(userId,EventType.UPCOMING);
	}
}
