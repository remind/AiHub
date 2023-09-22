package com.aihub.spi;

import lombok.Getter;

@Getter
public enum AiPlatform {

    DASH_SCOPE("dashScope"),

    SPARK_API("xy")

    ;
    private final String code;

    private AiPlatform(String code) {
        this.code = code;
    }
}
