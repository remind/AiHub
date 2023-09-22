package com.aihub.service.entity.common.result;

import lombok.Getter;

/**
 * 结果码
 */
@Getter
public enum ResultCode {
    SUCCESS("S001", "成功")
    ;

    private String code;

    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
