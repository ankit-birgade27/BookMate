package com.bookmate.model;



import java.util.List;

public class Book {

    private String bookId;
    private String isbn;
    private String title;
    private String description;

    private int publicationYear;

    private Author author;
    private Publisher publisher;
    private Category category;

    private List<BookCopy> bookCopies;

    public Book() {
    }

    public Book(String bookId, String isbn, String title,
                String description, int publicationYear,
                Author author, Publisher publisher,
                Category category) {

        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.publicationYear = publicationYear;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<BookCopy> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(List<BookCopy> bookCopies) {
        this.bookCopies = bookCopies;
    }
}