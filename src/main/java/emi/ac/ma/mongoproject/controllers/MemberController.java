package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Member;
import emi.ac.ma.mongoproject.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PutMapping("/{id}")
    public void updateMember(@PathVariable String id, @RequestBody Member updatedMember) {
        memberService.updateMember(id, updatedMember);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable String id) {
        memberService.deleteMember(id);
    }
}
