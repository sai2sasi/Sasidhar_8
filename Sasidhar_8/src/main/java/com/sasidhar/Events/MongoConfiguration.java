package com.sasidhar.Events;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfiguration {
	
	@Value("$spring.mongo.uri")
	private String uri;
	
	@Bean
	public MongoTemplate getMongoBDTemplate() throws Exception{
		return new MongoTemplate(new SimpleMongoClientDbFactory(uri));
	}

}
