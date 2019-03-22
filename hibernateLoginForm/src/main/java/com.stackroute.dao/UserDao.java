package com.stackroute.dao;

import com.stackroute.model.User;

import java.util.List;

public interface UserDao {
    public boolean saveUser(User user);
    public List<User> getUserdetails();
}
