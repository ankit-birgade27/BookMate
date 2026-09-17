package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.model.Member;
import com.bookmate.storage.DataStore;

public class MemberDao {
	public List<Member> findAll(){
		return new ArrayList<>(DataStore.getMembers());
	}
}





 