package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.BookCopy;
import com.bookmate.model.IssueRecord;
import com.bookmate.model.Member;
import com.bookmate.storage.DataStore;

public class Issuedao{
	 public void saveIssue(IssueRecord issue) {
		 DataStore.getIssueRecords().add(issue);
	 }
	 
	 public BookCopy findCopyById(String copyId) {
		 List<BookCopy> copies = DataStore.getBookCopies();
		 for(BookCopy copy : copies) {
			 if(copyId.equals(copy.getCopyId())) {
				 return copy;
			 }
		 }
		 return null;
	 }
	 
	 public Member findMemberById(String memberId) {
		 List<Member> members = DataStore.getMembers();
		 for(Member member : members) {
			 if(memberId.equals(member.getMemberId())) {
				 return member;
			 }
		 }
		 return null;
	 }
	 

}
