package com.hs.web.app.controller;

import com.hs.web.app.base.conditional.ApiVersion;
import com.hs.web.app.entity.DemoEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.app.controller
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 13:11
 * Description :
 * 系统版本 ： 1.0
 */
@RestController
@RequestMapping("/{version}/app")
public class AppDemoController {

    @Value("${service-app-name}")
    String serviceAppName;

    @RequestMapping("/hi")
    @ApiVersion(1)
    public String helloWorldV1(@Valid DemoEntity demoEntity){
        return  "Hi " + demoEntity.getName() + ",This is Version1.0 API Feign" ;
    }

    @RequestMapping("/hi")
    @ApiVersion(2)
    public String helloWorldV2(@Valid DemoEntity demoEntity){
        return  "Hi " + demoEntity.getName() + ",This is Version2.0 API Feign";
    }

    /**
     * @Test：获取统一配置中心的配置信息
     * @param demoEntity
     * @return
     */
    @ApiVersion(1)
    @RequestMapping(value = "/sayConfig",method = RequestMethod.GET)
    public String sayConfig(@Valid DemoEntity demoEntity){
        return "New The Config Center for ServiceFront's name is : " + serviceAppName;
    }

}
