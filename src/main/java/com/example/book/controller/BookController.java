package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.BookService;
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")

public class BookController {

	
	@Autowired
	private BookService bookService;

	@PostMapping("/registerStudent")
	public Book registerBookt(@RequestBody Book book) {
		return bookService.registerBook(book);
	}
	
	@GetMapping("/getBook")
	public List<Book> getStudents(){
		return bookService.getBook();		
	}
	
	@DeleteMapping("/deleteBook")
	public void deleteBook(@RequestParam Integer bookid) {
		bookService.deleteBook(bookid);
	}
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return  bookService.updateBook(book);
	}
}
