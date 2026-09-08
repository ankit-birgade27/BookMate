package com.bookmate.model;



import java.util.List;

public class Library {

    private String libraryId;
    private String name;

    private Address address;
    private ContactInfo contactInfo;

    private List<LibraryBranch> branches;

    public Library() {
    }

    public Library(String libraryId, String name,
                   Address address, ContactInfo contactInfo) {
        this.libraryId = libraryId;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<LibraryBranch> getBranches() {
        return branches;
    }

    public void setBranches(List<LibraryBranch> branches) {
        this.branches = branches;
    }
}