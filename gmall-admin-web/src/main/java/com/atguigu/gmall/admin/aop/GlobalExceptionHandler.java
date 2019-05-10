package com.atguigu.gmall.admin.aop;

import com.atguigu.gmall.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一处理所有异常，给前端返回500的json
 *
 * 当我们编写环绕通知的时候，目标方法出现的异常一定要再次跑出去
 */
@Slf4j
@RestControllerAdvice  //代表当前类是一个异常处理类
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {ArithmeticException.class})  //表示异常处理方法  处理数学运算异常
    public Object handlerException(Exception exception){
        log.error("系统全局异常感知，信息：{}",exception.getStackTrace()); //可以得到整个对象信息
        return new CommonResult().validateFailed("数学没学好");
    }


    @ExceptionHandler(value = {NullPointerException.class})  //空指针异常
    public Object handlerException02(Exception exception){
        log.error("系统出现异常感知，信息：{}",exception.getMessage());
        return new CommonResult().validateFailed("空指针了...");
    }


}
