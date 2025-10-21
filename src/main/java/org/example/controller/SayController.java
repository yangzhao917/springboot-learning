package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangzhao
 */
@Controller
public class SayController {

    @ResponseBody
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
