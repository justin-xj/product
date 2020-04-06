package com.justin.product.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "test2")
    private void consumerListen(String content){
        System.out.println(content);
    }
}
