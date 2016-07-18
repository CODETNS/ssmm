package com.alex.dao;

import com.alex.domain.User;

public interface UserDao {
	 
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  
 
}
