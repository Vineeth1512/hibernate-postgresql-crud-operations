package com.example.controller;

import com.example.dto.Book;
import com.example.service.BookService;

public class UpdateBookController {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("The alchamist");
		book.setAuthor("Adam Molla");
		book.setPublicatonYear(2021);

		BookService bookService = new BookService();
		Book updateBook = bookService.BookUpdate(book);
		if(updateBook!=null) {
			System.out.println("Book details updated...");
		}else {
			System.out.println("Book details not updated...");

		}
	}

}
