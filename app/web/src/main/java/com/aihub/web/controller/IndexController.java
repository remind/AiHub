package com.aihub.web.controller;

import com.aihub.service.integration.SpiRegister;
import com.aihub.spi.AiPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private SpiRegister spiRegister;

    @RequestMapping("/test")
    public String test() {
        return spiRegister.getSpiImpl(AiPlatform.DASH_SCOPE, "qwen-trubo").getClass().getName();
    }
}
