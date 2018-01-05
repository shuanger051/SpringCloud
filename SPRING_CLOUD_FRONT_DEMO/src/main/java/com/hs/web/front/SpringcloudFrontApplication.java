package com.hs.web.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.hs.web.front"})
@EnableFeignClients
@EnableDiscoveryClient
public class SpringcloudFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFrontApplication.class, args);
	}

}
