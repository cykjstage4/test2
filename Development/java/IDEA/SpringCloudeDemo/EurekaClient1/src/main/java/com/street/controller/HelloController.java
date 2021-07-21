package com.street.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/15 16:58
 * @desc:
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("hello/{name}")
    public String Hellow(@PathVariable String name) {
        System.out.println(name);
        return "hellow";
    }

    @Autowired
    private RestTemplate restTemplate;

    //负载均衡 LoadBalanced
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }



    //测试独具client的请求
    @ResponseBody
    @RequestMapping("getEureaClient/{id}")
    public String getEureaClient(@PathVariable String id){
        System.out.println(id);
        String url = "http://client-test/house/"+id;
       String remsg = restTemplate.getForObject(url,String.class);

        return "房东"+remsg;
    }





}
