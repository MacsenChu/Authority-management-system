package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.Select;
import xyz.macsen.ssm.domain.Member;

public interface MemberDao {

    @Select("select * from member where id = #{id}")
    Member findById(String id) throws Exception;
}
