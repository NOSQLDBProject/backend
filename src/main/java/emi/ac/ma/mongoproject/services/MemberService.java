package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Member;

import java.util.List;

public interface MemberService {
    Member addMember(Member member);
    List<Member> getAllMembers();
    Member getMember(Long id);
    void updateMember(Long id, Member updatedMember);
    void deleteMember(Long id);
}
