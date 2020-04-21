package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import xyz.macsen.ssm.domain.SysLog;

import java.util.List;

public interface SysLogDao {

    @Insert("insert into sysLog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog) throws Exception;

    @Select("select * from sysLog")
    List<SysLog> findAll() throws Exception;

}
