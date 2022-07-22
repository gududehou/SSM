package com.monkey.service;

import com.github.pagehelper.PageInfo;
import com.monkey.domain.User;

import java.util.List;

public interface UserService {
    List<User> selectAllUsers();

    PageInfo<User> selectAllUsersPage(Integer pageSize, Integer pageNum);
}
