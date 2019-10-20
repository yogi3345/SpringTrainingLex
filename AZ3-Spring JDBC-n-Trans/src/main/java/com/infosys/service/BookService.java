package com.infosys.service;

import com.infosys.domain.Book;

public interface BookService {

	// Method to access data access layer method to insert Employee record
	public void insertBook(Book book);

	// Method to access data access layer method to remove a record
	public int removeBook(int bookId);

	void updateBook(Book book);
}
