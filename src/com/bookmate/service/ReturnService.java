package com.bookmate.service;

import com.bookmate.model.ReturnRecord;

public interface ReturnService {

    ReturnRecord returnBook(String issueId);

    ReturnRecord getReturnById(String returnId);

    ReturnRecord getReturnByIssueId(String issueId);

    int calculateOverdueDays(String issueId);

    boolean isOverdue(String issueId);
}