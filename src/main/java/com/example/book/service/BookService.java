package com.example.book.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookrepository;
	
	public Book registerBook(Book  book) {
		return bookrepository.save(book);
	}
	
	public List<Book> getBook(){
		return (List<Book>)bookrepository.findAll();		 
	}
	
	public void deleteBook(Integer bookid) {
		bookrepository.deleteById(bookid);
	}
	
	public Book updateBook(Book book) {
        Integer Bookid = book.getBookid();
		Book std = bookrepository.findById(Bookid).get();
		std.setBookname(book.getBookname());
		std.setAuthorname(book.getAuthorname());
		std.setAmount(book.getAmount());
		return bookrepository.save(std);
	}
}
