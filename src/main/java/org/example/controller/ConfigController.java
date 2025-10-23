package org.example.controller;

import org.example.config.AppConfig;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping(value = "/api/configs")
@RestController
public class ConfigController {

    @Resource
    private AppConfig appConfig;

    @ResponseBody
    @GetMapping
    public String getAllConfigs() {
        return appConfig.getAppTitle() + " " + appConfig.getAppDescription() + " " + appConfig.getAppVersion() + " " + appConfig.getAuthor();
    }

}
