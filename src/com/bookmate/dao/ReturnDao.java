package com.bookmate.dao;

import com.bookmate.model.ReturnRecord;
import com.bookmate.storage.DataStore;

public class ReturnDao {
	
	public ReturnRecord findById(String returnId) {
		for(ReturnRecord record : DataStore.getReturnRecords()) {
			if(returnId.equals(record.getReturnId())) {
				return record;
			}
		}
		
		return null;
		
	}
}
