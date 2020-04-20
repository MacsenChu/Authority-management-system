package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.*;
import xyz.macsen.ssm.domain.Role;

import java.util.List;

public interface RoleDao {

    // 根据用户id查询出所哟路对应的角色
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = List.class, many = @Many(select = "xyz.macsen.ssm.dao.PermissionDao.findPermissionByRoleId"))
    })
    List<Role> findRoleByUserId(String uerId) throws Exception;

    @Select("select * from role")
    List<Role> findAll() throws Exception;

    @Insert("insert into role(roleName, roleDesc) values(#{roleName}, #{roleDesc})")
    void save(Role role);
}
