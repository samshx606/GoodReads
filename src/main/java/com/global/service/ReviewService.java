package com.global.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.model.Review;
import com.global.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	
	public Review add(Review review) {
		return reviewRepository.save(review);
	}
	public Review update(Review review) {
		return reviewRepository.save(review);
	}
	public void delete(Integer id) {
		reviewRepository.deleteById(id);
	}
	public Iterable<Review> findAll(){
		return reviewRepository.findAll();
	}
}
