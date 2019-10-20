package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.domain.Book;
import com.infosys.repository.AuthorDAO;
import com.infosys.repository.BookDAO;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDao;
	
	@Autowired
	AuthorDAO authorDao; 

	@Override
	public void insertBook(Book book) {
		authorDao.addAuthor(book);
		bookDao.insert(book);
		System.out.println("Book Inserted");
	}

	@Override
	public int removeBook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.delete(bookId);
	}
	
	@Override
	@Transactional()
	public void updateBook(Book book) {
		authorDao.updateAuthor(book);
		bookDao.updateBook(book);
		System.out.println(bookDao.getA());
		System.out.println("Book updated");
	}
}
