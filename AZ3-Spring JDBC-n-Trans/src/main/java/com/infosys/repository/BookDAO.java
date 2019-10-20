package com.infosys.repository;

import com.infosys.domain.Book;

public interface BookDAO {

	// Method to insert Employee record into Employee table
	public void insert(Book book);

	// Method to remove a record from Employee table
	public int delete(int bookId);

	void updateBook(Book book);
	
	public int getA();

	public void setA(int a);

}
