package com.infyBoot1.FirstBootApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infyBoot1.FirstBootApp.Entity.Author;
import com.infyBoot1.FirstBootApp.Repository.AuthorRepository;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	AuthorRepository authorRepository; 

	@Override
	public void insertAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.saveAndFlush(author);
		System.out.println("Author Inserted");
	}

}
