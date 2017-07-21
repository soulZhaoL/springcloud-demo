package com.cloud.demo.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by LeiZhaosh on 2017/7/18.
 */
@Service
public class ComputerService {

    @Autowired
    private RestTemplate restTemplate ;

    //@HystrixCommand(fallbackMethod = "addServiceFallBack")  断路器机制
    @HystrixCommand(fallbackMethod = "addServiceFallBack")
    public String addService(){
        String result =  restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20" , String.class).getBody();
        return result ;
    }


    public String addServiceFallBack(){
        return "error";
    }



}
