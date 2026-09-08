package com.bookmate.model;



import java.time.LocalDate;
import java.util.List;

import com.bookmate.enums.MemberStatus;



public class Member {

    private String memberId;
    private String firstName;
    private String lastName;

    private ContactInfo contactInfo;
    private Address address;

    private LocalDate registrationDate;
    private LocalDate expiryDate;

    private MemberStatus status;

    private Membership membership;

    private List<IssueRecord> issueRecords;
    private List<Reservation> reservations;
    private List<Fine> fines;

    public Member() {
    }

    public Member(String memberId, String firstName, String lastName,
                   ContactInfo contactInfo, Address address,
                   LocalDate registrationDate, LocalDate expiryDate,
                   MemberStatus status) {

        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.address = address;
        this.registrationDate = registrationDate;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public List<IssueRecord> getIssueRecords() {
        return issueRecords;
    }

    public void setIssueRecords(List<IssueRecord> issueRecords) {
        this.issueRecords = issueRecords;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Fine> getFines() {
        return fines;
    }

    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }
}