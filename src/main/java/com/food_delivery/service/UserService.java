package com.food_delivery.service;

import java.util.Set;

import com.food_delivery.model.User;
import com.food_delivery.model.UserRole;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);
}
