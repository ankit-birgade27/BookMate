package com.bookmate.model;

import java.util.List;

public class Publisher {

	    private String publisherId;
	    private String name;
	    private String email;
	    private String phone;

	    private Address address;

	    private List<Book> books;

	    public Publisher() {
	    }

	    public Publisher(String publisherId, String name,
	                     String email, String phone, Address address) {
	        this.publisherId = publisherId;
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	        this.address = address;
	    }

	    public String getPublisherId() {
	        return publisherId;
	    }

	    public void setPublisherId(String publisherId) {
	        this.publisherId = publisherId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public List<Book> getBooks() {
	        return books;
	    }

	    public void setBooks(List<Book> books) {
	        this.books = books;
	    }
	}