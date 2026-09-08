package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.dao.FineDao;
import com.bookmate.dao.Issuedao;
import com.bookmate.model.IssueRecord;
import com.bookmate.service.IssueService;

public class IssueServiceImpl implements IssueService{

	private Issuedao Issuedao;
	public IssueServiceImpl(Issuedao Issuedao) {
    this.Issuedao = Issuedao;
}

	@Override
	public IssueRecord issueBook(String memberId, String copyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IssueRecord getIssueById(String issueId) {
		// TODO Auto-generated method stub
		return null;
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
		return false;
	}

	@Override
	public void renewBook(String issueId) {
		// TODO Auto-generated method stub
		
	}

}
