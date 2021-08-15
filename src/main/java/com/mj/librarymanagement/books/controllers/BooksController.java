package com.mj.librarymanagement.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.librarymanagement.books.services.BookService;
import com.mj.librarymanagement.entities.Book;


@RestController
@RequestMapping(value = "/books/book")
public class BooksController {
	@Autowired
	BookService bookService;
	
	@GetMapping(value="/{id}")
	private Book getBook(@PathVariable(value = "id" )String id) {
		return bookService.getBookById(Integer.valueOf(id));
	}

}
