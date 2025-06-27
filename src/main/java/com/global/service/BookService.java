package com.global.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.model.Book;
import com.global.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book add(Book book) {
		return bookRepository.save(book);
	}
	public Book update(Book book) {
		return bookRepository.save(book);
	}
	public Iterable<Book> findAll(){
		return bookRepository.findAll();
	}
	public void deleteById(Integer id) {
		bookRepository.deleteById(id);
	}
}
