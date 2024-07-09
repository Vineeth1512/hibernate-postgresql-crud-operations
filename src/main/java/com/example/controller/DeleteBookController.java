package com.example.controller;

import com.example.dto.Book;
import com.example.service.BookService;

public class DeleteBookController {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookId(2);
		BookService bookService = new BookService();
		Book deleteBook = bookService.deleteBook(book.getBookId());
		if (deleteBook != null) {
			System.out.println("Book deleted successfully");
		} else {
			System.out.println("Book does not  exsist");

		}
	}

}
