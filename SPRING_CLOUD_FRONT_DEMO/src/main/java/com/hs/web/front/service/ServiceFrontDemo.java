package com.hs.web.front.service;

import com.hs.web.front.entity.DemoEntity;
import com.hs.web.front.service.impl.ServiceFrontDemoHystric;
import feign.Headers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Map;

/**
 * Project ： SPRING_CLOUD_EUREKA_DEMO
 * PackageName ： com.hs.web.front.service
 * Author ： caijl
 * Date ： 2018/1/5
 * Time ： 17:31
 * Description : 由于消费者Fegin方式调用无法直接使用path路径传递版本信息,此处采用API-Version机制与服务端进行版本匹配
 * 系统版本 ： 1.0
 */
@FeignClient(name = "frontDemoService" , url = "${gateway.api.url}",fallback = ServiceFrontDemoHystric.class)
public interface ServiceFrontDemo {

    @RequestMapping(value = "/v1/app/hi",method = RequestMethod.GET)
    String frontServiceDemoV1(@RequestHeader("Authorization") String authorization, @RequestParam Map<String,Object> param);

    @RequestMapping(value = "/v2/app/hi",method = RequestMethod.GET)
    String frontServiceDemoV2(@RequestHeader("Authorization") String authorization,@RequestParam Map<String,Object> param);

    @RequestMapping(value = "/v1/app/sayConfig",method = RequestMethod.GET)
    String sayConfig(@RequestHeader("Authorization") String authorization,@RequestParam Map<String,Object> param);

}
