package com.lyonlu.springbootmall.service;

import com.lyonlu.springbootmall.dto.UserRegisterRequest;
import com.lyonlu.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
