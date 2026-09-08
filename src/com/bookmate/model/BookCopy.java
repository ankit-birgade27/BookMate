package com.bookmate.model;

import com.bookmate.enums.BookStatus;

public class BookCopy {

    private String copyId;
    private String barcode;
    private Book book;
    private Shelf shelf;

    private BookStatus status;

    private double purchasePrice;

    public BookCopy() {
    }

    public BookCopy(String copyId, String barcode,
                    Book book, Shelf shelf,
                    BookStatus status, double purchasePrice) {

        this.copyId = copyId;
        this.barcode = barcode;
        this.book = book;
        this.shelf = shelf;
        this.status = status;
        this.purchasePrice = purchasePrice;
    }

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
