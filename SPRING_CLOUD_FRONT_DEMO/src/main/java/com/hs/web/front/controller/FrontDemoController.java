package com.hs.web.front.controller;

import com.hs.web.front.entity.DemoEntity;
import com.hs.web.front.service.ServiceFrontDemo;
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
 * Description :
 * 系统版本 ： 1.0
 */
@RestController
@RequestMapping("/front")
public class FrontDemoController {

    @Autowired
    private ServiceFrontDemo serviceFrontDemo;

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String frontServiceDemo(@Valid DemoEntity demoEntity){
        return serviceFrontDemo.frontServiceDemo(demoEntity.getName());
    }

}
