package xyz.macsen.ssm.service;

import xyz.macsen.ssm.domain.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
