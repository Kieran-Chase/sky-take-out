package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Kieran_Chase
 * @project sky-take-out
 * @date 2026/2/3
 */
public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
