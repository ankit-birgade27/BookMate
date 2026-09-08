package com.bookmate.serviceimpl;

import java.util.List;

import com.bookmate.dao.MemberDao;
import com.bookmate.model.Member;
import com.bookmate.service.MemberService;

public class MemberServiceImpl  implements MemberService{


    private MemberDao memberDao;

    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }


	@Override
	public Member registerMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberById(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member) {
		// TODO Auto-generated method stub
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
