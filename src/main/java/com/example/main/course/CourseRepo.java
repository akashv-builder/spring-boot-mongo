package com.example.main.course;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CourseRepo extends MongoRepository<Course, String> {

	public Optional<Course> findByDescription(String desc);
	
}
