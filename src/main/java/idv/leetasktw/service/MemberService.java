package idv.leetasktw.service;

import idv.leetasktw.model.Member;
import idv.leetasktw.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public List<Member> findAll() {
        return memberDao.selectAll();
    }
}
