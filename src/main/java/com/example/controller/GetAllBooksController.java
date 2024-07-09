package com.example.controller;

import java.util.List;

import com.example.dto.Book;
import com.example.service.BookService;

public class GetAllBooksController {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		List<Book> list = bookService.getAllBooks();
		if (list != null) {
			for (Book book : list) {
				System.out.println("Employee name:" + book.getBookId());
				System.out.println("Employee name:" + book.getBookName());
				System.out.println("Employee salary:" + book.getAuthor());
				System.out.println("Employee Address:" + book.getPublicatonYear());
				System.out.println("-------------------------------------------");

			}
		}
	}
}
