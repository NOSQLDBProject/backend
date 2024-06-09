package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Member;
import emi.ac.ma.mongoproject.repositories.MemberRepository;
import emi.ac.ma.mongoproject.services.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    public Member getMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public void updateMember(Long id, Member updatedMember) {
        updatedMember.setId(id);
        memberRepository.save(updatedMember);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
