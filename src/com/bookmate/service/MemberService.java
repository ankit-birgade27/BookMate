package com.bookmate.service;

import java.util.List;

import com.bookmate.model.Member;


public interface MemberService {

    Member registerMember(Member member);

    Member getMemberById(String memberId);

    List<Member> getAllMembers();

    Member updateMember(Member member);

    void deleteMember(String memberId);

    void activateMember(String memberId);

    void suspendMember(String memberId);

    List<Member> searchMembers(String keyword);

    boolean memberExists(String memberId);
}
