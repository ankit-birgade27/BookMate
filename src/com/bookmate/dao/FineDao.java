package com.bookmate.dao;

import com.bookmate.model.Fine;
import com.bookmate.storage.DataStore;

public class FineDao {
	
	public Fine findById(String fineId) {
		for(Fine fine : DataStore.getFines()) {
			if(fineId.equals(fine.getFineId())) {
				return fine;
			}
		}
		return null;
	}
    
}
