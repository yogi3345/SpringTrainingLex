package com.infyBoot1.FirstBootApp.Service;

import com.infyBoot1.FirstBootApp.Entity.Author;

public interface AuthorService {

	public Author insertAuthor(Author author);

	public Author getAuthorById(int id);
}
