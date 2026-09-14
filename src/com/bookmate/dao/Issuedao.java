package com.bookmate.dao;

import java.util.List;

import com.bookmate.model.IssueRecord;
import com.bookmate.storage.DataStore;

public class Issuedao{
	
	public IssueRecord findById(String issueId) {
		List<IssueRecord> issues = DataStore.getIssues();
		
		for(IssueRecord issue: issues) {
			if(issueId.equals(issue.getIssueId())) {
				return issue;
			}
		}
		
		return null;
	}
}
