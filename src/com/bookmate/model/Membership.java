package com.bookmate.model;
import java.time.LocalDate;

import com.bookmate.enums.MembershipType;
public class Membership {

    private String membershipId;
    private MembershipType membershipType;

    private LocalDate startDate;
    private LocalDate endDate;

    private double membershipFee;

    private Member member;

    public Membership() {
    }

    public Membership(String membershipId,
                      MembershipType membershipType,
                      LocalDate startDate,
                      LocalDate endDate,
                      double membershipFee,
                      Member member) {

        this.membershipId = membershipId;
        this.membershipType = membershipType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.membershipFee = membershipFee;
        this.member = member;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}