package com.aihub.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 响应结果
 * @param <T>
 */
@Data
@AllArgsConstructor
public class Result<T> {

    /**
     * 执行状态，是否成功
     */
    private boolean success;

    /**
     * 结果码
     */
    private String code;

    /**
     * 结果消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 返回成功，不带数据
     * @return
     * @param <T>
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 返回成功并带数据
     * @param data  数据
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(T data) {
        return success(ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 构造成功结果
     * @param message   消息提示
     * @param data      返回数据
     * @return  结果
     * @param <T>   数据类型
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<T>(true, ResultCode.SUCCESS.getCode(), message, data);
    }

}
