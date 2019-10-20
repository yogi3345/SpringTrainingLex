package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Author;
import com.infosys.repository.AuthorRepository;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	AuthorRepository authorRepository; 

	@Override
	public Author insertAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorRepository.saveAndFlush(author);
	}

}
