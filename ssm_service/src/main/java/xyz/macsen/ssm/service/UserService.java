package xyz.macsen.ssm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import xyz.macsen.ssm.domain.UserInfo;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;
}
