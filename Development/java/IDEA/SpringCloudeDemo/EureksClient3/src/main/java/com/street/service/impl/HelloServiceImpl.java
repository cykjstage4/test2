package com.street.service.impl;

import com.street.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/16 16:10
 * @desc:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Override
    public String getAdmin(String id) {
        System.out.println("client service -----"+id);
        ServiceInstance instance = loadBalancer.choose("admin-test");
        URI url = URI.create(String.format("http://%s:%s/provider", instance.getHost(), instance.getPort()));
        RestTemplate restTemplate = new RestTemplate();
        String msg = restTemplate.getForObject(url, String.class);
        return msg;
    }
}
