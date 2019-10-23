package com.infyBoot1.FirstBootApp.Entity;

public class Author {
	
	private String firstName;
	
	private String lastName;
	
	private int authorId;
	
	private String emailId;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
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
	public Author(String firstName, String lastName, int authorId, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.authorId = authorId;
		this.emailId = emailId;
	}
	
	public Author() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", authorId=" + authorId + ", emailId="
				+ emailId + "]";
	}	
	
}