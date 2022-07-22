package com.monkey.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {
    private Integer status;
    private String message;
    private Object data;

    public static ResponseResult ok(String message, Object data) {
        return new ResponseResult(200, message, data);
    }

    public static ResponseResult ok(String message) {
        return new ResponseResult(200, message, null);
    }

    public static ResponseResult error(String message) {
        return new ResponseResult(500, message, null);
    }

    public static ResponseResult error(Integer status, String message) {
        return new ResponseResult(status, message, null);
    }
}
