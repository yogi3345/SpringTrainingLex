package com.infyBoot1.FirstBootApp.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infyBoot1.FirstBootApp.DTO.BookDTO;
import com.infyBoot1.FirstBootApp.Entity.Book;

public interface BookService {

	// Method to access data access layer method to remove a record
	public int removeBook(int bookId);

	Book insertOrUpdateBook(Book book);

	void insertOrUpdateBooks(List<Book> books);
	
	Page<Book> findAll(Pageable page);
	List<Book> findAll(Sort sort);

	Book getBook(int bookId);
}
