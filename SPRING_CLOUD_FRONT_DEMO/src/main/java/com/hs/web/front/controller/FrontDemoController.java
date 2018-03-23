package com.hs.web.front.controller;

import com.hs.web.front.base.conditional.ApiVersion;
import com.hs.web.front.entity.DemoEntity;
import com.hs.web.front.service.ServiceFrontDemo;
import com.hs.web.front.util.BeanMapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.front.controller
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 17:46
 * Description : 前端模块Controller Demo
 * 系统版本 ： 1.0
 */
@RestController
@RequestMapping("/{version}/front")
public class FrontDemoController {

    @Autowired
    private ServiceFrontDemo serviceFrontDemo;

    @ApiVersion(1)
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String frontServiceDemoV1(@Valid DemoEntity demoEntity){
        return serviceFrontDemo.frontServiceDemoV1("123",BeanMapUtils.transBean2Map(demoEntity));
    }

    @ApiVersion(2)
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String frontServiceDemoV2(@Valid DemoEntity demoEntity){
        return serviceFrontDemo.frontServiceDemoV2("123",BeanMapUtils.transBean2Map(demoEntity));
    }

    @ApiVersion(1)
    @RequestMapping(value = "/sayConfig",method = RequestMethod.GET)
    public String sayConfig(@Valid DemoEntity demoEntity){
        return serviceFrontDemo.sayConfig("123",BeanMapUtils.transBean2Map(demoEntity));
    }

}
