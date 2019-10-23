package com.infyBoot1.FirstBootApp.Controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infyBoot1.FirstBootApp.DTO.BookDTO;
import com.infyBoot1.FirstBootApp.Entity.Author;
import com.infyBoot1.FirstBootApp.Entity.Book;
import com.infyBoot1.FirstBootApp.Service.BookService;
@RestController
@RequestMapping
@CrossOrigin
public class BookController 
{
	@Autowired
	public BookService bookService;
	
	@Value("${author.url}")
	public String url;
	
	//Fetching the Book details
	@GetMapping(value="/{bookId}")
	public ResponseEntity<BookDTO> fetchBook(@PathVariable int bookId)
	{
		//This method will fetch the Books of Infytel and return the same. 
		Book book = bookService.getBook(bookId);
		Author author = new RestTemplate().getForObject(url+"/"+book.getAuthorId(), Author.class);
		BookDTO bookDTO = book.toBookDTO();
		bookDTO.setAuthor(author);
		return ResponseEntity.ok(bookDTO);
	}
		
	//Adding a new Book
	@PostMapping
	public String createBook(@RequestBody Book book, Errors errors) 
	{
		//This method will persist the details of a Book
		if(errors.hasErrors()) {
			return errors.getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.joining(","));
		}
		bookService.insertOrUpdateBook(book);
		return "Book created successfully with id = " + book.getBookId();
	}
	
	//Updating an existing Book
	@PutMapping
	public String updateBook() 
	{
		//This method will update the details of an existing Book 
		return "Book details updated successfully";
	}
	
		
	//Deleting a Book
	@DeleteMapping
	public String deleteBook() 
	{
		//This method will delete a Book 
		return "Book details deleted successfully";
	}
}