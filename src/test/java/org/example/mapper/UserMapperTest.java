package org.example.mapper;

import org.example.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        System.out.println("开始测试 UserMapperTest");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("结束测试 UserMapperTest");
    }

    @Test
    public void getUserById() {
        System.out.println(userMapper.getUserById(4L));
    }

    @Test
    public void getAllUsers() {
        System.out.println(userMapper.getAllUsers());
    }

    @Test
    public void addUser() {
        int addUser = userMapper.addUser(new User("yangzhao", "123456"));
        System.out.println(addUser);
    }

    @Test
    public void deleteUserById() {
        int record = userMapper.deleteUserById(2L);
        System.out.println(record);
    }

}