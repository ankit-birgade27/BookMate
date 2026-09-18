package com.bookmate.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.bookmate.model.Member;
import com.bookmate.storage.DataStore;

public class MemberDao {
	private static final AtomicInteger idGenerator = new AtomicInteger(1001);
	
	public List<Member> findAll(){
		return new ArrayList<>(DataStore.getMembers());
	}
	
	public void saveMember(Member member) {
		DataStore.getMembers().add(member);
	}
	
	public Member findById(String memberId) {
		List<Member> members=DataStore.getMembers();
			
		for(Member m:members) {
			if(memberId.equals(m.getMemberId())) {
				return m;
			}
		}
		return null;
		
	}
	
	public Member findByEmail(String email) {
		List<Member> members=DataStore.getMembers();
		
		for(Member m:members) {
			if(email.equals(m.getContactInfo().getEmail())) {
				return m;
			}
		}
		return null;
	}
	
	public Member findByMobile(String mobile) {
		List<Member> members=DataStore.getMembers();
		
		for(Member m:members) {
			if(mobile.equals(m.getContactInfo().getMobileNumber())) {
				return m;
			}
		}
		return null;
	}
	
	public int generateUniqueMemberId() {
		return idGenerator.getAndIncrement();
	}
	
	
}





 