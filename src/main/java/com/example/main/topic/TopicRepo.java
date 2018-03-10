package com.example.main.topic;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepo extends MongoRepository<Topic, String> {

}
