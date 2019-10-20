package com.infosys.client;



import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infosys.domain.Author;
import com.infosys.domain.Book;
import com.infosys.repository.BookRepository;
import com.infosys.service.AuthorService;
import com.infosys.service.BookService;

public class ClientLogic {
	private static Logger log=Logger.getLogger(ClientLogic.class);
	public static void main(String[] arg) {
		//AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		try {
			BookService bookService = (BookService) ctx.getBean("bookService");
			AuthorService authorService = (AuthorService) ctx.getBean("authorService");
			
			
			// Don't Delete Commented code, it can be used to execute functionalities
			// A bit of modification might/might not be required
			
			
			// Create Employee instances
			/*Author author = new Author("J.K.", "Rowling", 1, "abc@xyz.com");
			authorService.insertAuthor(author);
			List<Book> listBook = new ArrayList<Book>();
			double d = 20d; 
			for(int i=0;i<6;i++) {
				Book book = new Book(i+1, "Harry Potter", author, d--);
				listBook.add(book);
			}
			bookService.insertOrUpdateBooks(listBook);
			BookRepository bookRepository = ctx.getBean(BookRepository.class);
			Sort sort = new Sort(Sort.Direction.ASC, "bookPrice");
			Pageable pageable = PageRequest.of(0, 4, sort);
			Iterable<Book> books = bookService.findAll(pageable);
			for(Book b:books)
				System.out.println(b);*/
			//authorService.insertAuthor(author);
			
			List<Double> listDoubles = new ArrayList<Double>();
			listDoubles.add(new Double(15.0));
			listDoubles.add(new Double(18.0));
			
			List<Book> books = bookService.getBooksByPriceList2(listDoubles);
			for(Book book:books)
				System.out.println(book);
			
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			log.debug(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		ctx.close();
	}
}
