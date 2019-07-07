package com.mine.siis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import com.mine.rules.MySelRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelRule.class)
public class DeptConsumer80_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_APP.class, args);
	}

}
