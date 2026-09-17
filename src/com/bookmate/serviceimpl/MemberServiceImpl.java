package com.bookmate.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.bookmate.dao.MemberDao;
import com.bookmate.exception.InvalidMemberException;
import com.bookmate.exception.MemberOperationException;
import com.bookmate.model.Member;
import com.bookmate.service.MemberService;

public class MemberServiceImpl  implements MemberService{


    private MemberDao memberDao;

    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }


	@Override
	public Member registerMember(Member member) {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public Member getMemberById(String memberId) {
		if(memberId.isBlank() || memberId==null) {
			throw new InvalidMemberException("Invalid memberId");
		}
		// TODO Auto-generated method stub
		Member member=memberDao.findById(memberId);
		
		if(member==null) {
			throw new InvalidMemberException("Member not found");
		}
		return null;
	}
	

	@Override
	public List<Member> getAllMembers() {
		List<Member> members = memberDao.findAll();
		
		if(members == null){
			throw new MemberOperationException("Invalid List");
		}
		if(members.isEmpty()) {
			return new ArrayList<Member>();
		}
		return members;
	}

	@Override
	public Member updateMember(Member member) {
		
		return null;
	}

	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activateMember(String memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suspendMember(String memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member> searchMembers(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean memberExists(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

}
