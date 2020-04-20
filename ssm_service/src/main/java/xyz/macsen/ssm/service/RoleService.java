package xyz.macsen.ssm.service;

import xyz.macsen.ssm.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;
}
