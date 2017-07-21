package com.cloud.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LeiZhaosh on 2017/7/17.
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a, Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        /*try {
            System.out.println("暂停10秒");
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }


}
