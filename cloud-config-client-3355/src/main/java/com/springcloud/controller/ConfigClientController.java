package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RefreshScope
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/configInfo")
    @ResponseBody
    public String getConfigInfo()
    {
        return configInfo;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello()
    {
        return "hello";
    }

}

