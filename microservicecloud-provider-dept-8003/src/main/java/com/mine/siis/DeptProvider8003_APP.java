package com.mine.siis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_APP.class, args);
	}

}