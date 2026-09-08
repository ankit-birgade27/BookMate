package com.bookmate.service;

import java.util.List;

import com.bookmate.model.IssueRecord;


public interface IssueService {

    IssueRecord issueBook(String memberId, String copyId);

    IssueRecord getIssueById(String issueId);

    List<IssueRecord> getAllIssues();

    List<IssueRecord> getMemberIssueHistory(String memberId);

    List<IssueRecord> getActiveIssues(String memberId);

    boolean canIssueBook(String memberId, String copyId);

    void renewBook(String issueId);
}