package com.infosys.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.infosys.domain.Book;

@Repository(value = "bookDao")
public class BookDAOImpl implements BookDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Autowired
	public void setDs(DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public void insert(Book book) {
		String query = "INSERT INTO Book(bookId, bookName, bookPrice, Author) values (:bookId, :bookName, :bookPrice, "+String.valueOf(book.getAuthor().getAuthorId())+")";
		//jdbcTemplate.update(query,  book.getBookId(), book.getBookName(), book.getBookPrice(), book.getAuthor().getAuthorId());
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(book);
		namedParameterJdbcTemplate.update(query, parameters);
	}

	@Override
	public int delete(int bookId) {
		String query = "DELETE FROM Book WHERE bookId = (:bookId)";
		//jdbcTemplate.update(query,  book.getBookId(), book.getBookName(), book.getBookPrice(), book.getAuthor().getAuthorId());
		SqlParameterSource  parameters = new MapSqlParameterSource("bookId",bookId);
		return namedParameterJdbcTemplate.update(query, parameters);
	}
	
	@Override
	public void updateBook(Book book) {
		String query = "UPDATE book SET bookId = :bookId, bookName = :bookName, bookPrice = :bookPrice, Author = " + book.getAuthor().getAuthorId() +" WHERE bookId = :bookId;";
		//jdbcTemplate.update(query,  book.getBookId(), book.getBookName(), book.getBookPrice(), book.getAuthor().getAuthorId());
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(book);
		namedParameterJdbcTemplate.update(query, parameters);
	}
	
	/*// Method to insert record into Employee table
	public void insert(Employee emp) {
		String query = "INSERT INTO Employee(EmpId, EmpName, department) values (?,?,?)";
		jdbcTemplate.update(query,  emp.getEmpId(), emp.getEmpName(), emp.getDepartment() );
	}

	// Method to remove a record from Employee table
	public int delete(int empId) {
		return jdbcTemplate.update("delete from Employee where empid = ? ", empId);
	}*/
}
