package com.infyBoot1.FirstBootApp.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infyBoot1.FirstBootApp.Entity.Book;
import com.infyBoot1.FirstBootApp.Service.BookService;
@RestController
@RequestMapping("/books")
public class BookController 
{
	@Autowired
	public BookService bookService;
	//Fetching the Book details
	@GetMapping(value="/{id}")
	public ResponseEntity<List<Book>> fetchBook(@PathVariable int id)
	{
		//This method will fetch the Books of Infytel and return the same. 
		List<Double> prices = new ArrayList<Double>();
		prices.add(15.0);
		prices.add(16.0);
		List<Book> books = bookService.getBooksByPriceList(prices);
		return ResponseEntity.ok(books);
	}
		
	//Adding a new Book
	@PostMapping
	public String createBook(@RequestParam("id") int id, @Valid @RequestBody Book book, Errors errors) 
	{
		//This method will persist the details of a Book
		if(errors.hasErrors()) {
			return errors.getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.joining(","));
		}
		bookService.insertOrUpdateBook(book);
		return "Book added successfully" + id;
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