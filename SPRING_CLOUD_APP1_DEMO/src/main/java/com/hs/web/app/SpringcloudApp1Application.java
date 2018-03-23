package com.hs.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApp1Application.class, args);
	}

}
