package com.bookmate.dao;
import java.util.List;
import com.bookmate.enums.BookStatus;
import com.bookmate.model.Book;
import com.bookmate.model.BookCopy;
import com.bookmate.model.IssueRecord;
import com.bookmate.model.ReturnRecord;
import com.bookmate.storage.DataStore;

public class ReturnDao {
	public IssueRecord findIssueById(String issueId) {
		List<IssueRecord> issues=DataStore.getIssues();
		
		for(IssueRecord record:issues) {
			if(issueId.equals(record.getIssueId())) {
				return record;
			}
		}
		return null;
	}
	
	public void updateIssue(IssueRecord issue) {
		List<IssueRecord> issues = DataStore.getIssues();
		
		for(int i = 0; i < issues.size(); i++) {
			IssueRecord existingRecord = issues.get(i);
			
			if(existingRecord.getIssueId().equals(issue.getIssueId())) {
				issues.set(i, issue);

	            return;
			}
		}
		
	}
	
	public void updateBookCopyStatus(String copyId, String status) {
		List<BookCopy> copies=DataStore.getcopies();
		
		for(int i=0;i<copies.size();i++) {
			BookCopy existingRecord=copies.get(i);
			
			if(copyId.equals(existingRecord.getCopyId())) {
				existingRecord.setStatus(BookStatus.AVAILABLE);
			}
		}
	}
	
	public void saveReturn(ReturnRecord returnRecord) {
		
	}
	
	
	public ReturnRecord findById(String returnId) {
		for(ReturnRecord record : DataStore.getReturnRecords()) {
			if(returnId.equals(record.getReturnId())) {
				return record;
			}
		}
		
		return null;
		
	}
}

