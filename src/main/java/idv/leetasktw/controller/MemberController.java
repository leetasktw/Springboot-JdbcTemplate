package idv.leetasktw.controller;

import idv.leetasktw.model.Member;
import idv.leetasktw.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/list")
    public List<Member> queryMembers() {
        return memberService.findAll();
    }
}
