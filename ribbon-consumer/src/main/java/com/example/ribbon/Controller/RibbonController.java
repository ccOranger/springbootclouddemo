package com.example.ribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @package: com.example.ribbon.Controller
 * @className: ${TYPE_NAME}
 * @description: 类作用描述
 * @author: 李臣臣
 * @createDate: 2019/4/25 17:50
 * @updateUser: 李臣臣
 * @updateDate: 2019/4/25 17:50
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2019</p>
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/consumer")
    public String helloController() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello/ss", String.class).getBody();
    }
}
