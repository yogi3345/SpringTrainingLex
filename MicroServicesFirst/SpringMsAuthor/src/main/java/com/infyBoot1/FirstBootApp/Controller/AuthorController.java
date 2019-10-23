package com.infyBoot1.FirstBootApp.Controller;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infyBoot1.FirstBootApp.Entity.Author;
import com.infyBoot1.FirstBootApp.Service.AuthorService;
@RestController
@RequestMapping
public class AuthorController 
{
	@Autowired
	public AuthorService authorService;
	//Fetching the Book details
	@GetMapping(value="/{id}")
	public ResponseEntity<Author> fetchAuthor(@PathVariable int id)
	{
		//This method will fetch the Books of Infytel and return the same. 
		Author author = authorService.getAuthorById(id);
		return ResponseEntity.ok(author);
	}
		
	
	@PostMapping
	public String createAuthor(@RequestBody Author author, Errors errors) 
	{
		//This method will persist the details of a Book
		if(errors.hasErrors()) {
			return errors.getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.joining(","));
		}
		author = authorService.insertAuthor(author);
		return "Author added Successfully with AuthorId = " + author.getAuthorId();
	}
	
/*	//Updating an existing Book
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
	}*/
}