package com.bookmate.model;



public class ContactInfo {

    private String email;
    private String mobileNumber;
    private String alternateMobileNumber;

    public ContactInfo() {
    }

    public ContactInfo(String email, String mobileNumber,
                       String alternateMobileNumber) {
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.alternateMobileNumber = alternateMobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", alternateMobileNumber='" + alternateMobileNumber + '\'' +
                '}';
    }
}