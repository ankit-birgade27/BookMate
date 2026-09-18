package com.bookmate.serviceimpl;

import com.bookmate.dao.ReturnDao;
import com.bookmate.exception.InvalidReturnException;
import com.bookmate.exception.ReturnNotFoundException;
import com.bookmate.model.ReturnRecord;
import com.bookmate.service.ReturnService;

public class ReturnServiceImpl implements ReturnService{
   
	 private ReturnDao returnDao;
	public ReturnServiceImpl(ReturnDao returnDao) {
	    this.returnDao = returnDao;
	}

	@Override
	public ReturnRecord returnBook(String issueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnRecord getReturnById(String returnId) {
		if(returnId == null || returnId.isBlank()) {
			throw new InvalidReturnException("Invalid Return ID");
		}
		
		ReturnRecord record = returnDao.findById(returnId);
		
		if(record == null) {
			throw new ReturnNotFoundException("Record not found");
		}
		
		return record;
	}

	@Override
	public ReturnRecord getReturnByIssueId(String issueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculateOverdueDays(String issueId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isOverdue(String issueId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
