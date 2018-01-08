package com.hs.web.front.service.impl;

import com.hs.web.front.entity.DemoEntity;
import com.hs.web.front.service.ServiceFrontDemo;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.front.service.impl
 * Author ： caijl
 * Date ： 2018/1/8
 * Time ： 9:55
 * Description : 添加服务熔断机制，当接口服务无法正常使用时触发
 * 系统版本 ： 1.0
 */
@Component
public class ServiceFrontDemoHystric implements ServiceFrontDemo{

    @Override
    public String frontServiceDemo(@Valid DemoEntity demoEntity){
        return "Sorry " + demoEntity.getName() + ", The Server which one you request is error.Please check the system logs.";
    }

}
