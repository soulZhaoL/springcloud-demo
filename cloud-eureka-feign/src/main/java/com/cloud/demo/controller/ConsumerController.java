package com.cloud.demo.controller;

import com.cloud.demo.client.ComputeClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LeiZhaosh on 2017/7/18.
 */

@Controller
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;



    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public Integer add() {
        return computeClient.add(10, 20);
    }


}
