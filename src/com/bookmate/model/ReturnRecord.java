package com.bookmate.model;
import java.time.LocalDate;



public class ReturnRecord {

    private String returnId;

    private IssueRecord issueRecord;
    private Librarian librarian;

    private LocalDate returnDate;

    private int overdueDays;

    private Fine fine;

    public ReturnRecord() {
    }

    public ReturnRecord(String returnId,
                        IssueRecord issueRecord,
                        Librarian librarian,
                        LocalDate returnDate,
                        int overdueDays,
                        Fine fine) {

        this.returnId = returnId;
        this.issueRecord = issueRecord;
        this.librarian = librarian;
        this.returnDate = returnDate;
        this.overdueDays = overdueDays;
        this.fine = fine;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public IssueRecord getIssueRecord() {
        return issueRecord;
    }

    public void setIssueRecord(IssueRecord issueRecord) {
        this.issueRecord = issueRecord;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }
}