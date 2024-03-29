package com.infyBoot1.FirstBootApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infyBoot1.FirstBootApp.Entity.Book;
import com.infyBoot1.FirstBootApp.Repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public int removeBook(int bookId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Book insertOrUpdateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.saveAndFlush(book);
	}
	
	@Override
	public void insertOrUpdateBooks(List<Book> books) {
		// TODO Auto-generated method stub
		bookRepository.saveAll(books);
		System.out.println("Books Updated");
	}

	@Override
	public Page<Book> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return bookRepository.findAll(page);
	}

	@Override
	public List<Book> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return bookRepository.findAll(sort);
	}

	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		//return bookRepository.findByBookPriceIn(prices);
		return bookRepository.findById(bookId).get();
	}
}
