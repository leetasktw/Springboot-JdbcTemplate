package idv.leetasktw.dao;

import idv.leetasktw.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Member> selectAll() {
        return jdbcTemplate.query("select * from member", new BeanPropertyRowMapper<>(Member.class));
    }
}
