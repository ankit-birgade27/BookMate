package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.exception.BookCopyNotFoundException;
import com.bookmate.exception.InvalidIssueException;
import com.bookmate.exception.IssueNotFoundException;
import com.bookmate.exception.MemberNotFoundException;
import com.bookmate.dao.Issuedao;
import com.bookmate.model.IssueRecord;
import com.bookmate.service.IssueService;

public class IssueServiceImpl implements IssueService {

    private Issuedao Issuedao;

    public IssueServiceImpl(Issuedao Issuedao) {
        this.Issuedao = Issuedao;
    }

    @Override
    public IssueRecord issueBook(String memberId, String copyId) {

        if(memberId == null || memberId.isBlank()) {
            throw new InvalidIssueException("Member ID is required.");
        }

        if(copyId == null || copyId.isBlank()) {
            throw new InvalidIssueException("Copy ID is required.");
        }

        var member = Issuedao.findMemberById(memberId);

        if(member == null) {
            throw new MemberNotFoundException("Member not found with ID :" + memberId);
        }

        var bookCopy = Issuedao.findCopyById(copyId);

        if(bookCopy == null) {
            throw new BookCopyNotFoundException("Book copy not found with ID :" + copyId);
        }
		
     // 5. Check whether member is allowed to issue a book
        if (!canIssueBook(memberId, copyId)) {
            throw new InvalidIssueException("Member is not allowed to issue this book.");
        }

        // 6. Check whether book copy is available
        if (bookCopy.getStatus() != com.bookmate.enums.BookStatus.AVAILABLE) {
            throw new com.bookmate.exception.BookNotAvailableException("Book copy is not available for issue.");
        }

        // 7. Create issue record
        IssueRecord issue = new IssueRecord();

        issue.setIssueId("ISS-" + System.currentTimeMillis());
        issue.setMember(member);
        issue.setBookCopy(bookCopy);

        // 8. Set issue date and default due date
        issue.setIssueDate(java.time.LocalDate.now());
        issue.setDueDate(java.time.LocalDate.now().plusDays(14));

        // Book copy status becomes ISSUED
        bookCopy.setStatus(com.bookmate.enums.BookStatus.ISSUED);

        // 9. Save issue record using DAO
        Issuedao.saveIssue(issue);

        // 10. Return issue record
        return issue;

    }

    @Override
    public IssueRecord getIssueById(String issueId) {

        if(issueId == null || issueId.isBlank()) {
            throw new InvalidIssueException("Invalid Issue ID");
        }

        IssueRecord issue = Issuedao.findById(issueId);

        if(issue == null) {
            throw new IssueNotFoundException("Issue not found");
        }

        return issue;
    }

    @Override
    public List<IssueRecord> getAllIssues() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<IssueRecord> getMemberIssueHistory(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<IssueRecord> getActiveIssues(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean canIssueBook(String memberId, String copyId) {
    	  // TODO Auto-generated method stub
    	  // Check member ID
        if (memberId == null || memberId.isBlank()) {
            return false;
        }

        // Check copy ID
        if (copyId == null || copyId.isBlank()) {
            return false;
        }

        // Check member exists
        if (Issuedao.findMemberById(memberId) == null) {
            return false;
        }

        // Check book copy exists
        var bookCopy = Issuedao.findCopyById(copyId);

        if (bookCopy == null) {
            return false;
        }

        // Check book copy is available
        if (bookCopy.getStatus() != com.bookmate.enums.BookStatus.AVAILABLE) {
            return false;
        }
        return true;
    }

    @Override
    public void renewBook(String issueId) {
        // TODO Auto-generated method stub
    }

}