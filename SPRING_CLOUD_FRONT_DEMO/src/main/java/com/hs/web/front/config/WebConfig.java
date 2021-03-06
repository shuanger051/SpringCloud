package com.hs.web.front.config;

import com.hs.web.front.base.conditional.CustomRequestMappingHandlerMapping;
import com.hs.web.front.service.ServiceFrontDemo;
import feign.Logger;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.app.config
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 14:45
 * Description : 通过JavaConfig的方式注入,使CustomRequestMappingHandlerMapping生效
 * 系统版本 ： 1.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        handlerMapping.setInterceptors(getInterceptors());
        return handlerMapping;
    }

    @Bean
    public Logger.Level loggerLevel(){
        return Logger.Level.FULL;
    }

    @Bean
    public Logger logger(){
        return new Slf4jLogger(ServiceFrontDemo.class);
    }

}
