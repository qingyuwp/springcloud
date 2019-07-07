package com.mine.siis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mine.siis.entities.Dept;

@RestController
public class DeptController_Consumer {
	//private static final String REST_URL_PREFIX="http://localhost:8001";
	private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
	/**
	 * 使用 restTemplate访问restful 接口非常的简单粗暴无脑
	 * （url,requestMap,ResponseBean.class）这三个参数分别代表Rest请求地址、请求参数、Http响应转换被转成的对象类型
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dep) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dep, Boolean.class);
	}
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		//												   consumer/dept/get/2
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
		
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
	@RequestMapping(value="/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
	}
}
