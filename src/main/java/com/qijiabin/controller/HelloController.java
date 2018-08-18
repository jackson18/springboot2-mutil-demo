package com.qijiabin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ========================================================
 * 日 期：2018/8/18 20:56
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${envName}")
    private String envName;

    @RequestMapping("/say")
    public Map<String, Object> say() {
        Map<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("errorCode", 200);
        hashMap.put("errorMsg", "这是一个测试");
        return hashMap;
    }

    @RequestMapping("/getName")
    public String getEnvName() {
        return envName;
    }

}
