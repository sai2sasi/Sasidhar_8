package com.sasidhar.Events.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasidhar.Events.vo.EventsVo;

@RestController
public class EventsController {

	@GetMapping("/getEvents")
	public List<EventsVo> getEventsList(){
		
		return null;
	}
}
