package com.monkey.exception;

import lombok.Data;

/**
 * 业务异常
 */
@Data
public class WorkException extends RuntimeException {
    private String msg;
    private int code = 500;

    public WorkException(String msg) {
        this.msg = msg;
    }

    public WorkException(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

}
