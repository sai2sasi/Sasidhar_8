package com.sasidhar.Events.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.sasidhar.Events.constants.EventType;

@Repository
public class EventsDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public <T> List<T> findAll( Class<T> clazz, String collection, EventType type){
		Query query = new Query();
		if(type.name().equalsIgnoreCase("ALL")){
			return mongoTemplate.findAll(clazz,collection);
		}else{
			query.addCriteria(Criteria.where("eventsType").in(type.name()));
			return mongoTemplate.find(query,clazz,collection);
		}
		
		
	}
	

}
