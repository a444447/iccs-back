package com.internship.backend;

import com.internship.backend.entity.user;
import com.internship.backend.mapper.UserMapper;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BackEndApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        user user= new user();
        user.setId(4);
        user.setUName("123");
        user.setUPassword("1234");
        userMapper.insert(user);
    }

}
