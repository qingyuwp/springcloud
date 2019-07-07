package com.mine.siis.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {//boot -->spring applicationContext.xml ---@Configuration配置
	
	@Bean
	@LoadBalanced//spring cloud Ribbon 是基于Netflix Ribbon 实现的一套客户端  负载均衡的工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myIRule() {
		//return new RoundRobinRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
		//return new RandomRule();
		return new RetryRule();
	}
}
