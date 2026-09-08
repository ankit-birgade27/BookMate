package com.bookmate.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.bookmate.enums.TransactionType;

public class Transaction {

    private String transactionId;

    private Member member;

    private TransactionType transactionType;

    private BigDecimal amount;

    private LocalDateTime transactionDate;

    private String description;

    public Transaction() {
    }

    public Transaction(String transactionId,
                       Member member,
                       TransactionType transactionType,
                       BigDecimal amount,
                       LocalDateTime transactionDate,
                       String description) {

        this.transactionId = transactionId;
        this.member = member;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}