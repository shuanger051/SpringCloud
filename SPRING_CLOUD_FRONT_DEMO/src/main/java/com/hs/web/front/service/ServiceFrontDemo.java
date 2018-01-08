package com.hs.web.front.service;

import com.hs.web.front.entity.DemoEntity;
import com.hs.web.front.service.impl.ServiceFrontDemoHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.front.service
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 17:31
 * Description :
 * 系统版本 ： 1.0
 */
@FeignClient(value = "service-app",fallback = ServiceFrontDemoHystric.class)
public interface ServiceFrontDemo {

    @RequestMapping(value = "${api.version}/app/hi",method = RequestMethod.GET)
    String frontServiceDemo(@Valid DemoEntity demoEntity);

}
