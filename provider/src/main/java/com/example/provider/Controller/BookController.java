package com.example.provider.Controller;

import org.sang.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @package: com.example.provider.Controller
 * @className: ${TYPE_NAME}
 * @description: 类作用描述
 * @author: 李臣臣
 * @createDate: 2019/4/30 14:21
 * @updateUser: 李臣臣
 * @updateDate: 2019/4/30 14:21
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2019</p>
 */
@RestController
@RequestMapping("/book")
public class BookController {
    private final Logger logger = Logger.getLogger(HelloController.class.getName());

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/sayhello")
    public String sayhello(String name) {
        List<ServiceInstance> instances = client.getInstances("hello-service");
        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World"+name;
    }

    @GetMapping(value = "/getbook1")
    public Book book1() {
        return new Book(90, "三国演义", "罗贯中", "2019-04-30");
    }

    @PostMapping(value = "/getbook2")
    public Book book2(@RequestBody Book book) {
        System.out.println(book.getName());
        book.setId(33);
        book.setAuthor("曹雪芹");
        book.setCreateTime("2019-11-11");
        return book;
    }
}
