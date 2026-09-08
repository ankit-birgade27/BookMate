package com.bookmate.model;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.bookmate.enums.FineStatus;



public class Fine {

    private String fineId;

    private Member member;
    private IssueRecord issueRecord;

    private BigDecimal amount;

    private LocalDate issuedDate;
    private LocalDateTime paidDate;

    private FineStatus status;

    private String reason;

    public Fine() {
    }

    public Fine(String fineId,
                Member member,
                IssueRecord issueRecord,
                BigDecimal amount,
                LocalDate issuedDate,
                FineStatus status,
                String reason) {

        this.fineId = fineId;
        this.member = member;
        this.issueRecord = issueRecord;
        this.amount = amount;
        this.issuedDate = issuedDate;
        this.status = status;
        this.reason = reason;
    }

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public IssueRecord getIssueRecord() {
        return issueRecord;
    }

    public void setIssueRecord(IssueRecord issueRecord) {
        this.issueRecord = issueRecord;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public FineStatus getStatus() {
        return status;
    }

    public void setStatus(FineStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}