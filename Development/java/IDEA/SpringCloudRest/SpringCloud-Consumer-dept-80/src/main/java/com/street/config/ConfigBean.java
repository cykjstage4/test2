package com.street.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/18 22:46
 * @desc:
 */
@Configuration
public class ConfigBean {   //Configuration ---spring  applactionContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
