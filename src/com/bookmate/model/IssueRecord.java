package com.bookmate.model;


import java.time.LocalDate;

public class IssueRecord {

    private String issueId;

    private Member member;
    private BookCopy bookCopy;
    private Librarian librarian;

    private LocalDate issueDate;
    private LocalDate dueDate;

    public IssueRecord() {
    }

    public IssueRecord(String issueId,
                       Member member,
                       BookCopy bookCopy,
                       Librarian librarian,
                       LocalDate issueDate,
                       LocalDate dueDate) {

        this.issueId = issueId;
        this.member = member;
        this.bookCopy = bookCopy;
        this.librarian = librarian;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}