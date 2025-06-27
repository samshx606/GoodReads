package com.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.model.Review;
import com.global.service.ReviewService;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	@PostMapping("")
	public Review add(@RequestBody Review review) {
		return reviewService.add(review);
	}
	@PutMapping("")
	public Review update(@RequestBody Review review) {
		return reviewService.update(review);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		reviewService.delete(id);
	}
	@GetMapping("")
	public Iterable<Review> findAll(){
		return reviewService.findAll();
	}
}
