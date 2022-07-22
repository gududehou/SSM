package com.monkey.dao;

import com.monkey.domain.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
