package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Member;

import java.util.List;

public interface MemberService {
    public Member addMember(Member member);
    public List<Member> getAllMembers();
    public void updateMember(Long id, Member updatedMember);
    public void deleteMember(Long id);
}
