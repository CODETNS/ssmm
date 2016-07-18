package com.alex.service;

import com.alex.domain.User;

public interface UserService {
    User selectUserById(Integer userId);  
}
