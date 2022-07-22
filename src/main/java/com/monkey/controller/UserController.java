package com.monkey.controller;

import com.github.pagehelper.PageInfo;
import com.monkey.domain.User;
import com.monkey.service.UserService;
import com.monkey.utils.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
//@RestController等于@ResponseBody + @Controller
public class UserController {

    //注入Service
    @Resource
    private UserService userService;

    //相当于@RequestMapping(method = RequestMethod.GET, value = "/getAllUsers")
    @GetMapping("/getAll")
    public ResponseResult getAllUsers() {
        List<User> users = userService.selectAllUsers();

        return ResponseResult.ok("查询所有用户成功", users);
    }

    @GetMapping("/page/{pageSize}/{pageNum}")
    public ResponseResult getAllUsersPage(@PathVariable Integer pageSize,
                                          @PathVariable Integer pageNum) {
        PageInfo<User> pageInfo = userService.selectAllUsersPage(pageSize, pageNum);
        return ResponseResult.ok("分页查询成功", pageInfo);
    }
}
