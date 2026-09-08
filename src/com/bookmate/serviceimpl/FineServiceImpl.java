package com.bookmate.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import com.bookmate.dao.FineDao;
import com.bookmate.model.Fine;
import com.bookmate.service.FineService;

public  class FineServiceImpl implements FineService {

	private FineDao fineDao;
	public FineServiceImpl(FineDao fineDao) {
	    this.fineDao = fineDao;
	}

	@Override
	public Fine calculateFine(String issueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fine getFineById(String fineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fine> getAllFines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fine> getMemberFines(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getTotalOutstandingFine(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void payFine(String fineId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waiveFine(String fineId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasOutstandingFine(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

}
