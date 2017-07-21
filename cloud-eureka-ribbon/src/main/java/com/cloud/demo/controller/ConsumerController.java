package com.cloud.demo.controller;

import com.cloud.demo.service.ComputerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


/**
 * Created by LeiZhaosh on 2017/7/18.
 */
@Controller
public class ConsumerController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ComputerService computerService;


    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    @ResponseBody
    public String add(){
        /*try {
            System.out.println("暂停10秒");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return computerService.addService();
    }

}
