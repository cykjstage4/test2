package com.street.controller;

import com.street.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/15 16:11
 * @desc:
 */
@RestController
public class HellowController {


    @ResponseBody
    @RequestMapping("hello")
    public String Hellow() {
        return "hellow";
    }

    @ResponseBody
    @RequestMapping("house/{id}")
    public String Hellow1(@PathVariable String id) {
        System.out.println(id);
        return "房东******"+id;
    }

    @ResponseBody
    @RequestMapping("")
    public String Hellow404() {
        return "404";
    }



    @Autowired
    private HelloServiceImpl helloService;
    @RequestMapping("helloService/{id}")
    public String HelloService(@PathVariable String id){
       String admin = helloService.getAdmin(id);
        System.out.println(admin);
        return admin;
    }


}
