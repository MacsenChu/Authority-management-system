package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.*;
import xyz.macsen.ssm.domain.Permission;
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

    @Select("select * from role where id = #{roleId}")
    Role findById(String roleId);

    @Select("select * from permission where id not in (select permissionId from role_permission where roleId = #{roleId})")
    List<Permission> findOtherPermissions(String roleId);

    @Insert("insert into role_permission(roleId, permissionId) values(#{roleId}, #{permissionId})")
    void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);
}
