package com.global.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
