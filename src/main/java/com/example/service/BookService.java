package com.example.service;

import java.util.List;

import com.example.dao.BookDao;
import com.example.dto.Book;

public class BookService {
	BookDao bookDao = new BookDao();

	public Book addBook(Book book) {
		return bookDao.saveBook(book);
	}

	public Book BookUpdate(Book book) {
		return bookDao.updateBook(book);
	}

	public Book getBookById(Book book) {
		return bookDao.getById(book);
	}

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	public Book deleteBook(int id) {
		return bookDao.deleteBook(id);
	}
}
