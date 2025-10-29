package org.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisServiceImplTest {

    @Resource
    private RedisServiceImpl redisService;

    private String key = "name";
    private String value = "yangzhao";

    @Before
    public void setUp() throws Exception {
        System.out.println("开始测试");
        redisService.setKey("name", "yangzhao");
        System.out.println(redisService.getKey("name"));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("结束测试");
    }

    @Test
    public void testSetKey() {
        redisService.setKey(key, value);
    }

    @Test
    public void testGetKey() {
        redisService.getKey(key);
    }


}