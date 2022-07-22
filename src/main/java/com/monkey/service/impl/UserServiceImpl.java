package com.monkey.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.monkey.dao.UserDao;
import com.monkey.domain.User;
import com.monkey.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //日志
    public static Logger logger = Logger.getLogger(UserServiceImpl.class);

    //注入Dao
    @Resource
    private UserDao userDao;

    @Override
    public List<User> selectAllUsers() {
        logger.info("查询所有用户成功");
        return userDao.selectAll();
    }

    /**
     * 分页查询用户
     *
     * @param pageSize 每页大小
     * @param pageNum  当前页码
     * @return
     */
    @Override
    public PageInfo<User> selectAllUsersPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userDao.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
