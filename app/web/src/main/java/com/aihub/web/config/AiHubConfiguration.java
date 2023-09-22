package com.aihub.web.config;

import com.aihub.service.integration.SpiRegister;
import com.aihub.spi.AiPlatform;
import com.aihub.spi.impl.dashcope.QianWenChatSpi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AiHubConfiguration implements WebMvcConfigurer {

    @Bean
    public SpiRegister spiRegister() {
        SpiRegister spiRegister = new SpiRegister();
        spiRegister.register(AiPlatform.DASH_SCOPE, "qwen-trubo", new QianWenChatSpi());
        spiRegister.register(AiPlatform.DASH_SCOPE, "qwen-plus", new QianWenChatSpi());
        return spiRegister;
    }
}
