package com.example.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String author;
	private int publicatonYear;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicatonYear() {
		return publicatonYear;
	}

	public void setPublicatonYear(int publicatonYear) {
		this.publicatonYear = publicatonYear;
	}

}
