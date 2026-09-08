package com.bookmate.model;



import java.time.LocalDate;

public class Librarian {

    private String librarianId;
    private String employeeId;

    private String firstName;
    private String lastName;

    private LocalDate joiningDate;

    private ContactInfo contactInfo;
    private Address address;

    private LibraryBranch branch;

    public Librarian() {
    }

    public Librarian(String librarianId, String employeeId,
                     String firstName, String lastName,
                     LocalDate joiningDate,
                     ContactInfo contactInfo,
                     Address address,
                     LibraryBranch branch) {

        this.librarianId = librarianId;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.contactInfo = contactInfo;
        this.address = address;
        this.branch = branch;
    }

    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
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

    public LibraryBranch getBranch() {
        return branch;
    }

    public void setBranch(LibraryBranch branch) {
        this.branch = branch;
    }
}
