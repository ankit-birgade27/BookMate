package com.bookmate.serviceimpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.bookmate.dao.FineDao;
import com.bookmate.enums.FineStatus;
import com.bookmate.exception.FineCalculationException;
import com.bookmate.exception.FineNotFoundException;
import com.bookmate.exception.InvalidFineException;
import com.bookmate.exception.IssueNotFoundException;
import com.bookmate.model.Fine;
import com.bookmate.model.IssueRecord;
import com.bookmate.service.FineService;

public  class FineServiceImpl implements FineService {

	private FineDao fineDao;
	public FineServiceImpl(FineDao fineDao) {
	    this.fineDao = fineDao;
	}

	@Override
	public Fine calculateFine(String issueId) {
	    // 1. Validate Issue ID
	    if (issueId == null || issueId.trim().isEmpty()) {
	        throw new InvalidFineException("Issue ID cannot be null or blank");
	    }

	    // 2. Find issue
	    IssueRecord issue = fineDao.findIssueById(issueId);

	    // 3. Check issue exists
	    if (issue == null) {
	        throw new IssueNotFoundException(
	                "Issue not found with ID: " + issueId
	        );
	    }

	    // 4. Get due date and return date
	    LocalDate dueDate = issue.getIssueDate();
	    LocalDate returnDate = issue.getDueDate();

	    if (dueDate == null) {
	        throw new FineCalculationException(
	                "Due date is missing for issue: " + issueId
	        );
	    }

	    // 5. Decide which date to use
	    LocalDate calculationDate;

	    if (returnDate != null) {
	        calculationDate = returnDate;
	    } else {
	        calculationDate = LocalDate.now();
	    }

	    // 6. Calculate overdue days
	    long overdueDays = ChronoUnit.DAYS.between(
	            dueDate,
	            calculationDate
	    );

	    // No overdue
	    if (overdueDays <= 0) {
	        overdueDays = 0;
	    }

	    // 7. Calculate fine
	    BigDecimal finePerDay = new BigDecimal("5");

	    BigDecimal amount = finePerDay.multiply(
	            BigDecimal.valueOf(overdueDays)
	    );

	    // 8. Find existing fine
	    Fine fine = fineDao.findByIssueId(issueId);

	    // Create new Fine if it doesn't exist
	    if (fine == null) {

	        fine = new Fine();

	        fine.setIssueRecord(issue);
	        fine.setMember(issue.getMember());
	        fine.setIssuedDate(LocalDate.now());
	    }

	    // 9. Set calculated amount
	    fine.setAmount(amount);

	    // 10. Set reason
	    fine.setReason(overdueDays + " days overdue");

	    // 11. Set status
	    if (amount.compareTo(BigDecimal.ZERO) > 0) {
	        fine.setStatus(FineStatus.WAIVED);
	    }

	    // 12. Save
	    fineDao.saveFine(fine);

	    // 13. Return Fine
	    return fine;
	}

	@Override
	public Fine getFineById(String fineId) {
		if(fineId == null || fineId.isBlank()) {
			throw new InvalidFineException("Invalid Fine Id");
		}
		
		Fine fine = fineDao.findById(fineId);
		
		if(fine == null) {
			throw new FineNotFoundException("Fine not found");
		}
		
		return fine;
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
