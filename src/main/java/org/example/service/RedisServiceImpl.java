package org.example.service;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@Logger
@Service
public class RedisServcieImpl {

    @Resource
    private RedisTemplate redisTemplate;

    public void setKey(String key, String value) {
        redisTemplate.boundValueOps(key).set(value);
    }

    public String getKey(String key) {
        try {
            // 获取数据
            return redisTemplate.boundValueOps(key).get().toString();
        } catch (Exception e) {
            log.error("get key error", e);
        }
        return "failure";
    }
}
