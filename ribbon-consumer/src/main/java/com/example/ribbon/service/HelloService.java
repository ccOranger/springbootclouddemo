package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @package: com.example.ribbon.service
 * @className: ${TYPE_NAME}
 * @description: 类作用描述
 * @author: 李臣臣
 * @createDate: 2019/5/28 17:13
 * @updateUser: 李臣臣
 * @updateDate: 2019/5/28 17:13
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2019</p>
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://HELLO-SERVICE/hello/ss", String.class);
        return responseEntity.getBody();
    }

    public String error() {
        return "error";
    }
}
