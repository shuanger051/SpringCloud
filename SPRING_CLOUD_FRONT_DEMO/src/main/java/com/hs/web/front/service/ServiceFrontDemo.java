package com.hs.web.front.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.front.service
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 17:31
 * Description :
 * 系统版本 ： 1.0
 */
@FeignClient(value = "service-app")
public interface ServiceFrontDemo {

    @RequestMapping(value = "${api.version}/app/hi",method = RequestMethod.GET)
    String frontServiceDemo(@RequestParam(value = "name") String name);

}
