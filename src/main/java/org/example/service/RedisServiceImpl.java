package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Redis服务实现类
 * @author yangzhao
 */
@Service
public class RedisServiceImpl {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 设置RedisTemplate，解决存值乱码的问题
     * @param redisTemplate RedisTemplate
     */
    @Autowired(required = false)
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(stringRedisSerializer);
        this.redisTemplate = redisTemplate;
    }

    /**
     * 设置Redis数据，默认过期时间 60 秒
     * @param key 键
     * @param value 值
     */
    public void setKey(String key, String value) {
        redisTemplate.opsForValue().set(key, value, 60, TimeUnit.SECONDS);
    }

    /**
     * 获取Redis数据
     * @param key 键
     * @return 值
     */
    public String getKey(String key) {
        return redisTemplate.opsForValue().get(key).toString();
    }
}
