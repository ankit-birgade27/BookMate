package com.bookmate.serviceimpl;

import java.time.LocalDate;

import com.bookmate.dao.ReturnDao;
import com.bookmate.enums.BookStatus;
import com.bookmate.exception.BookAlreadyReturnedException;
import com.bookmate.exception.InvalidReturnException;
import com.bookmate.exception.IssueNotFoundException;
import com.bookmate.exception.ReturnNotFoundException;
import com.bookmate.model.IssueRecord;
import com.bookmate.model.ReturnRecord;
import com.bookmate.service.ReturnService;

public class ReturnServiceImpl implements ReturnService {

    private ReturnDao returnDao;

    public ReturnServiceImpl(ReturnDao returnDao) {
        this.returnDao = returnDao;
    }

    @Override
    public ReturnRecord returnBook(String issueId) {

        if (issueId == null || issueId.isBlank()) {
            throw new InvalidReturnException("Issue ID is required.");
        }

        IssueRecord issue = returnDao.findIssueById(issueId);

        if (issue == null) {
            throw new IssueNotFoundException(
                    "Issue not found with ID: " + issueId
            );
        }

     
        if (issue.getBookCopy() == null ||
            issue.getBookCopy().getStatus() != BookStatus.ISSUED) {

            throw new BookAlreadyReturnedException(
                    "Book has already been returned for Issue ID: " + issueId
            );
        }

        int overdueDays = 0;

        if (issue.getDueDate() != null) {
            LocalDate today = LocalDate.now();

            if (today.isAfter(issue.getDueDate())) {
                overdueDays =
                        (int) (today.toEpochDay() - issue.getDueDate().toEpochDay());
            }
        }

        ReturnRecord returnRecord = new ReturnRecord();

        returnRecord.setReturnId("RET-" + System.currentTimeMillis());

        returnRecord.setIssueRecord(issue);
        returnRecord.setReturnDate(LocalDate.now());
        returnRecord.setOverdueDays(overdueDays);

        returnDao.updateBookCopyStatus(
                issue.getBookCopy().getCopyId(),
                "AVAILABLE"
        );

        returnDao.saveReturn(returnRecord);

        return returnRecord;
    }

    @Override
    public ReturnRecord getReturnById(String returnId) {

        if (returnId == null || returnId.isBlank()) {
            throw new InvalidReturnException("Invalid Return ID");
        }

        ReturnRecord record = returnDao.findById(returnId);

        if (record == null) {
            throw new ReturnNotFoundException("Record not found");
        }

        return record;
    }

    @Override
    public ReturnRecord getReturnByIssueId(String issueId) {
        return null;
    }

    @Override
    public int calculateOverdueDays(String issueId) {
        return 0;
    }

    @Override
    public boolean isOverdue(String issueId) {
        return false;
    }
}