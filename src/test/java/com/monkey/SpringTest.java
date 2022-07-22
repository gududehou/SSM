package com.monkey;

import com.monkey.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//让测试运行与Spring测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//设置Spring配置文件或者配置类
//@ContextConfiguration(classes = SpringConfig.class)
public class SpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUser() {
        System.out.println(userService.selectAllUsers());
    }
}