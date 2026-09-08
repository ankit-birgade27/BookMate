package com.bookmate.model;



	import java.util.List;

	public class LibraryBranch {

	    private String branchId;
	    private String branchName;

	    private Address address;
	    private ContactInfo contactInfo;

	    private List<Shelf> shelves;
	    private List<Librarian> librarians;

	    public LibraryBranch() {
	    }

	    public LibraryBranch(String branchId, String branchName,
	                         Address address, ContactInfo contactInfo) {
	        this.branchId = branchId;
	        this.branchName = branchName;
	        this.address = address;
	        this.contactInfo = contactInfo;
	    }

	    public String getBranchId() {
	        return branchId;
	    }

	    public void setBranchId(String branchId) {
	        this.branchId = branchId;
	    }

	    public String getBranchName() {
	        return branchName;
	    }

	    public void setBranchName(String branchName) {
	        this.branchName = branchName;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public ContactInfo getContactInfo() {
	        return contactInfo;
	    }

	    public void setContactInfo(ContactInfo contactInfo) {
	        this.contactInfo = contactInfo;
	    }

	    public List<Shelf> getShelves() {
	        return shelves;
	    }

	    public void setShelves(List<Shelf> shelves) {
	        this.shelves = shelves;
	    }

	    public List<Librarian> getLibrarians() {
	        return librarians;
	    }

	    public void setLibrarians(List<Librarian> librarians) {
	        this.librarians = librarians;
	    }
	}