package com.temu.coupon.framework.config;

import com.temu.coupon.framework.web.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;

/*
* web组件自动装配类
*/
public class WebAutoConfiguration {

    /**
     * 构建全局异常拦截器组件 Bean
     */
    @Bean
    public GlobalExceptionHandler globalExceptionHandler(){
        return new GlobalExceptionHandler();
    }
}
