package com.infyBoot1.FirstBootApp.Repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.infyBoot1.FirstBootApp.Entity.Book;

@Component("authorDAO")
public class AuthorDAOImpl {
//implements AuthorRepository {
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDs(DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	//@Override
	public void addAuthor(Book book) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO Author(AuthorId, firstName, lastName) values (:AuthorId, :firstName, :lastName)";
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(book.getAuthor());
		namedParameterJdbcTemplate.update(query, parameters);
		//jdbcTemplate.update(query,  book.getAuthor().getAuthorId(), book.getAuthor().getFirstName(), book.getAuthor().getLastName());
		
	}

	//@Override
	public void updateAuthor(Book book) {
		// TODO Auto-generated method stub
		String query = "UPDATE author SET authorId = :authorId, firstName = :firstName, lastName = :lastName WHERE authorId = :authorId;";
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(book.getAuthor());
		namedParameterJdbcTemplate.update(query, parameters);

	}

}
