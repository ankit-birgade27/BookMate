package com.bookmate.dao;

import java.util.List;

import com.bookmate.model.Fine;
import com.bookmate.model.IssueRecord;
import com.bookmate.storage.DataStore;

public class FineDao {
	
	private Issuedao issueDao = new Issuedao();

    public IssueRecord findIssueById(String issueId) {
        return issueDao.findById(issueId);
    }

    public Fine findByIssueId(String issueId) {
    	
        for (Fine fine : DataStore.getFines()) {
            if (issueId.equals(fine.getIssueRecord().getIssueId())) {
                return fine;
            }
        }

        return null;
    }

    public void saveFine(Fine fine) {
    	
    		List<Fine> fines = DataStore.getFines();
        Fine existingFine = findByIssueId(fine.getIssueRecord().getIssueId());

        if (existingFine != null) {
            fines.remove(existingFine);
        }

        fines.add(fine);
    }
	
	public Fine findById(String fineId) {
		for(Fine fine : DataStore.getFines()) {
			if(fineId.equals(fine.getFineId())) {
				return fine;
			}
		}
		return null;
	}
    
}
