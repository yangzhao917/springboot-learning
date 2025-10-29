package org.example.service;

import org.example.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
// classes : 指定启动类
@SpringBootTest(classes = App.class)
public class UserServiceImplTest {

    @Resource
    private UserServiceImpl userService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDoAdd() {
        userService.doAdd();
    }
}