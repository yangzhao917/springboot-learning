package org.example.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.example.config.AppConfig;
import org.example.service.RedisServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping(value = "/api/configs")
@RestController
@Logger
public class ConfigController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ConfigController.class);
    @Resource
    private AppConfig appConfig;

    @Resource
    private RedisServiceImpl redisService;

    /**
     * 获取应用配置信息
     * @return 应用配置信息
     */
    @ResponseBody
    @GetMapping
    public String getAppConfig() {
        return appConfig.getAppTitle() + " " + appConfig.getAppDescription() + " " + appConfig.getAppVersion() + " " + appConfig.getAuthor();
    }

    /**
     * 设置Redis数据
     * @param key 键
     * @param value 值
     * @return 状态
     */
    @GetMapping("/setKey/{key}/{value}")
    public String setKey(@PathVariable("key") String key,
                         @PathVariable("value") String value) {
        try {
            // 存入数据
            redisService.setKey(key, value);
            return "success";
        } catch (Exception e) {
            log.error("set key error", e);
        }
        return "failure";
    }

    @GetMapping("/getKey/{key}")
    public String getKey(@PathVariable("key") String key) {
        try {
            // 获取数据
            return redisService.getKey(key);
        } catch (Exception e) {
            log.error("get key error", e);
        }
        return "failure";
    }

}
