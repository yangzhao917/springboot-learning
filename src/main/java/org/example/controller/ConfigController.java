package org.example.controller;

import org.example.config.AppConfig;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping(value = "/api/configs")
@RestController
public class ConfigController {

    @Resource
    private AppConfig appConfig;

    /**
     * 获取应用配置信息
     * @return 应用配置信息
     */
    @ResponseBody
    @GetMapping
    public String getAppConfig() {
        return appConfig.getAppTitle() + " " + appConfig.getAppDescription() + " " + appConfig.getAppVersion() + " " + appConfig.getAuthor();
    }

}
