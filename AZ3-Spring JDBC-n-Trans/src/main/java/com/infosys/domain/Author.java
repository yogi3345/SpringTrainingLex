package com.infosys.domain;

public class Author {
	
	private String firstName;
	private String lastName;
	private int authorId;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Author(String firstName, String lastName, int authorId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.authorId = authorId;
	}
	
	
	
}