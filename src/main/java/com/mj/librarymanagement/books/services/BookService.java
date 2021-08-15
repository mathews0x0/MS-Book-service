package com.mj.librarymanagement.books.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mj.librarymanagement.entities.Book;

@Service
public class BookService {
	
	private static List<Book> booksList =Arrays.asList(new Book(1,"book a",3,500.0),new Book(2,"book b",1,700.0),new Book(3,"book c",5,200.0));
	public Book getBookById(int id) {

		for(Book b :booksList) {
			if(b.getBookId()==id) {
				return b;
			}
		}
		
		return null;
	}
	
	public Book addBook(Book book) {
		if(booksList.add(book)) {
			return book;
		}
		return null;
	}


}
