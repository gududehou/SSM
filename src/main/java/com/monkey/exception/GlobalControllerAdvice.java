package com.monkey.exception;

import com.monkey.utils.ResponseResult;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalControllerAdvice {

    //log4j打印日志
    public static Logger logger = Logger.getLogger(GlobalControllerAdvice.class);

    @ExceptionHandler(Exception.class)//这里捕获所有异常
    @ResponseBody
    public ResponseResult handleException(Exception e) {
        if (e instanceof WorkException) {
            logger.error("业务异常");
            e.printStackTrace();
            return ResponseResult.error(500, e.getMessage());
        }
        logger.error("全局异常处理");
        e.printStackTrace();
        return ResponseResult.error(500, e.getMessage());
    }
}