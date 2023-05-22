package idv.leetasktw.model.dao;

import idv.leetasktw.dao.MemberDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberDaoTest {

    @Autowired
    MemberDao memberDao;

    @Test
    void selectAll() {
        System.out.println("查詢結果: " + memberDao.selectAll());
    }
}