package com.justin.product.kafka.controller;

import com.justin.product.kafka.produce.Message;
import com.justin.product.kafka.produce.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kafkaController {
    @Autowired
    private Producer producer;

    @RequestMapping("/hello")
    public String testKafka(){

        Message msg = new Message(1,"testname","hello world");

        producer.send(msg);
        return "success";
    }
}
