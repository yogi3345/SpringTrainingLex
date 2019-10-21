package com.infyBoot1.FirstBootApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "BooksJPA2")
public class Book {
	
	@Id
	@GeneratedValue
    @Column(name = "bookId")
	private int bookId;
	
	@Column(name = "bookName")
	@NotBlank
	private String bookName;
	
	@ManyToOne
    @JoinColumn(name = "authorId")
	private Author author;
	
	@Column(name = "bookPrice")
	private double bookPrice;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book(int bookId, String bookName, Author author, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	
	public Book() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorId=" + author.getAuthorId() + ", bookPrice=" + bookPrice
				+ "]";
	}
	
	
	
}