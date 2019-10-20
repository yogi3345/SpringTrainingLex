package com.infosys.client;



import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infosys.domain.Author;
import com.infosys.domain.Book;
import com.infosys.service.BookService;

public class ClientLogic {
	private static Logger log=Logger.getLogger(ClientLogic.class);
	public static void main(String[] arg) {
		//AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		try {
		BookService bookService = (BookService) ctx.getBean("bookService");

		// Create Employee instances
		Author author = new Author("J.K.", "Rowling", 2);
		Book book = new com.infosys.domain.Book(2, "Harry Potter", author, 20.50);
			bookService.updateBook(book);
			//bookService.removeBook(book.getBookId());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			System.out.println(e.getMessage());
		}
		ctx.close();
	}
}
