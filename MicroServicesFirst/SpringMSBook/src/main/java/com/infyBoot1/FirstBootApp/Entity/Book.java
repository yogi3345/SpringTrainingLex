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

import com.infyBoot1.FirstBootApp.DTO.BookDTO;

@Entity
@Table(name = "BooksJPA")
public class Book {
	
	@Id
	@GeneratedValue
    @Column(name = "bookId")
	private int bookId;
	
	@Column(name = "bookName")
	@NotBlank
	private String bookName;
	
    @Column(name = "authorId")
	private int authorId;
	
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
	public int getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book(int bookId, String bookName, int authorId, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorId = authorId;
		this.bookPrice = bookPrice;
	}
	
	public Book() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorId=" + authorId + ", bookPrice="
				+ bookPrice + "]";
	}
	
	public BookDTO toBookDTO() {
		Author author = new Author();
		author.setAuthorId(this.authorId);
		return new BookDTO(this.bookId, this.bookName, author, this.bookPrice);
	}
	
}