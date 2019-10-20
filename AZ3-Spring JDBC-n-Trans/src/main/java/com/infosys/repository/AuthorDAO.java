package com.infosys.repository;

import com.infosys.domain.Book;

public interface AuthorDAO {

	public void addAuthor(Book book);
	public void updateAuthor(Book book);
}
