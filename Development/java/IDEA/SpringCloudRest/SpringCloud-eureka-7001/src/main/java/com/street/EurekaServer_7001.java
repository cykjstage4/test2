package com.street;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/19 10:38
 * @desc:
 */
@SpringBootApplication
@EnableEurekaServer  //EnableEurekaServer服务端的启动类可以接收别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
