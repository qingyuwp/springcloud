package com.mine.siis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_APP.class, args);
	}

}
