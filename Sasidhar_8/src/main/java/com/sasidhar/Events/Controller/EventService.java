package com.sasidhar.Events.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sasidhar.Events.constants.EventType;
import com.sasidhar.Events.vo.EventsVo;


@Service
public class EventService {

	private static final Logger logger = LoggerFactory.getLogger(EventService.class);
	
	public List<EventsVo> getEvents(String userId, EventType type){
		logger.info("Fetching the EventDetails");
		
		
		
		return null;
		
	}
}
