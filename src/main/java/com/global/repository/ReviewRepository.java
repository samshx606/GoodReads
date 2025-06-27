package com.global.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.model.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer>{
	
}
