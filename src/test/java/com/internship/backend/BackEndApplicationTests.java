package com.internship.backend;

import com.internship.backend.entity.DUser;
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
        DUser DUser = new DUser();
        DUser.setId(4);
        DUser.setUName("123");
        DUser.setUPassword("1234");
        userMapper.insert(DUser);
    }

}
