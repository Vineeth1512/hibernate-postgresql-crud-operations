package com.example.controller;

import com.example.dto.Book;
import com.example.service.BookService;

public class AddBookController {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookId(2);
		book.setBookName("rich dad");
		book.setAuthor("pavan sai");
		book.setPublicatonYear(1567);
		BookService bookService = new BookService();
		Book saveBook = bookService.addBook(book);
		if (saveBook != null) {
			System.out.println("Book Details Added successfully");
		} else {
			System.out.println("Book Details not Added ");

		}
	}
}
