package com.example.controller;

import com.example.dto.Book;
import com.example.service.BookService;

public class GetBookByIdController {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookId(1);
		BookService bookService = new BookService();
		Book getBookId = bookService.getBookById(book);
		if (getBookId != null) {
			System.out.println("Book Name: " + getBookId.getBookName());
			System.out.println("Book Auther: " + getBookId.getAuthor());
			System.out.println("Book PublicationYear: " + getBookId.getPublicatonYear());
		}

	}
}
