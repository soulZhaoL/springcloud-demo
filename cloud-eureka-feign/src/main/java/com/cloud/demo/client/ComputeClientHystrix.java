package com.cloud.demo.client;

import org.springframework.stereotype.Component;

/**
 * Created by LeiZhaosh on 2017/7/18.
 */
@Component
public class ComputeClientHystrix implements  ComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
