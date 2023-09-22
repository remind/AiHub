package com.aihub.service.integration;

import com.aihub.spi.AiPlatform;
import com.aihub.spi.AigcSpi;

import java.util.HashMap;
import java.util.Map;

public class SpiRegister {

    private final Map<String, Map<String, AigcSpi>> aigcSpiMap = new HashMap<>();

    public void register(AiPlatform aiPlatform, String modelCode, AigcSpi aigcSpi) {
        if (!aigcSpiMap.containsKey(aiPlatform.getCode())) {
            aigcSpiMap.put(aiPlatform.getCode(), new HashMap<>());
        }
        if (aigcSpiMap.get(aiPlatform.getCode()).containsKey(modelCode)) {
            // 已经存在，抛出异常
        }
        aigcSpiMap.get(aiPlatform.getCode()).put(modelCode, aigcSpi);
    }

    public AigcSpi getSpiImpl(AiPlatform aiPlatform, String modelCode) {
        Map<String, AigcSpi> map = aigcSpiMap.get(aiPlatform.getCode());
        if (map != null && map.containsKey(modelCode)) {
            return map.get(modelCode);
        }
        return null;
    }
}
