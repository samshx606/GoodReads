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

import com.global.model.Book;
import com.global.service.BookService;
@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("")
	public Book add(@RequestBody Book book) {
		return bookService.add(book);
	}
	@PutMapping("")
	public Book update(@RequestBody Book book) {
		return bookService.update(book);
	}
	@GetMapping("")
	public Iterable<Book> findAll(){
		return bookService.findAll();
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		bookService.deleteById(id);
	}
}
