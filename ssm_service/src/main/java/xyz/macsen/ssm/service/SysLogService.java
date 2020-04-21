package xyz.macsen.ssm.service;

import xyz.macsen.ssm.domain.SysLog;

import java.util.List;

public interface SysLogService {

    void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
