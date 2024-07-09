package com.example.dao;

import java.util.List;

import com.example.dto.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BookDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vineeth");
	EntityManager em = emf.createEntityManager();

	public Book saveBook(Book book) {
		EntityTransaction et = em.getTransaction();
		if (book != null) {
			et.begin();
			em.persist(book);
			et.commit();
		}
		return book;

	}

	public Book updateBook(Book book) {
		EntityTransaction et = em.getTransaction();
		// Book updateBook = em.find(Book.class, book.getBookId());
		if (book != null) {
			et.begin();
			em.merge(book);
			et.commit();
		}
		return book;
	}

	public Book getById(Book book) {
		Book getBook = em.find(Book.class, book.getBookId());
		return getBook;
	}

	public List<Book> getAllBooks() {
		Query query = em.createQuery("SELECT a FROM Book a");
		@SuppressWarnings("unchecked")
		List<Book> list = query.getResultList();
		return list;

	}

	public Book deleteBook(int id) {
		EntityTransaction et = em.getTransaction();
		Book deleteBook = em.find(Book.class, id);
		if (deleteBook != null) {
			et.begin();
			em.remove(deleteBook);
			et.commit();
		}
		return deleteBook;
	}
}
