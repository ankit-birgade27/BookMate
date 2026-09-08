package com.bookmate.model;



import java.util.List;

public class Shelf {

    private String shelfId;
    private String shelfNumber;
    private String location;

    private LibraryBranch branch;

    private List<BookCopy> bookCopies;

    public Shelf() {
    }

    public Shelf(String shelfId, String shelfNumber,
                 String location, LibraryBranch branch) {
        this.shelfId = shelfId;
        this.shelfNumber = shelfNumber;
        this.location = location;
        this.branch = branch;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LibraryBranch getBranch() {
        return branch;
    }

    public void setBranch(LibraryBranch branch) {
        this.branch = branch;
    }

    public List<BookCopy> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(List<BookCopy> bookCopies) {
        this.bookCopies = bookCopies;
    }
}