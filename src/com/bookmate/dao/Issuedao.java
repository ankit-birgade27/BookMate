package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.BookCopy;
import com.bookmate.model.IssueRecord;
import com.bookmate.model.Member;
import com.bookmate.storage.DataStore;

public class Issuedao{
	public List<IssueRecord> findAll(){
		return new ArrayList<>(DataStore.getIssues());
	}
	
	public IssueRecord findById(String issueId) {
		List<IssueRecord> issues = DataStore.getIssues();
		
		for(IssueRecord issue: issues) {
			if(issueId.equals(issue.getIssueId())) {
				return issue;
			}
		}
		
		return null;
	}
	
	public Member findMemberById(String memberId) {
		List<Member> members=DataStore.getMembers();
		
		for(Member m:members) {
			if(memberId.equals(m.getMemberId())) {
				return m;
				
			}
		}
		return null;
		
	}
	
	public BookCopy findCopyById(String copyId) {
		List<BookCopy> copies = DataStore.getcopies();
		
		for(BookCopy copy:copies) {
			if(copyId.equals(copy.getCopyId())) {
				return copy;
			}
		}
		return null;
	}

	public void saveIssue(IssueRecord issue) {
		// TODO Auto-generated method stub
		DataStore.getIssues().add(issue);
	}
}
