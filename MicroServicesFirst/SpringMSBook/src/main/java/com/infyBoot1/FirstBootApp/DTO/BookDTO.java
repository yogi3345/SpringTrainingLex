package com.infyBoot1.FirstBootApp.DTO;

import com.infyBoot1.FirstBootApp.Entity.Author;
import com.infyBoot1.FirstBootApp.Entity.Book;

public class BookDTO {
	
private int bookId;
	
	private String bookName;
	private Author author;
	private double bookPrice;
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	/**
	 * @return the bookPrice
	 */
	public double getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookPrice="
				+ bookPrice + "]";
	}
	
	public BookDTO(int bookId, String bookName, Author author, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	public Book toEntity(){
		return new Book(this.bookId, this.bookName, this.author.getAuthorId(), this.bookPrice);
	}
	
	public Book toEntity(Author author){
		return new Book(this.bookId, this.bookName, author.getAuthorId(), this.bookPrice);
	}
	
}
