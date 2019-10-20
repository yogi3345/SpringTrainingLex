package com.infyBoot1.FirstBootApp.DTO;

import com.infyBoot1.FirstBootApp.Entity.Author;
import com.infyBoot1.FirstBootApp.Entity.Book;

public class BookDTO {
	
private int bookId;
	
	private String bookName;
	private Author authorEntity;
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
	/**
	 * @return the author
	 */
	public Author getAuthorEntity() {
		return authorEntity;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthorEntity(Author authorEntity) {
		this.authorEntity = authorEntity;
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
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", authorEntity=" + authorEntity + ", bookPrice="
				+ bookPrice + "]";
	}
	
	public Book createEntity(){
		return null;
	}
	
}
