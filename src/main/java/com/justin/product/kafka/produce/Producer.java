package com.justin.product.kafka.produce;


import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(Message msg){
        kafkaTemplate.send(kafkaTemplate.getDefaultTopic(), JSON.toJSONString(msg));
        kafkaTemplate.setProducerListener(new ProducerListener() {

            @Override
            public void onSuccess(String topic, Integer partition, Object key, Object value, RecordMetadata recordMetadata) {
                System.out.println("发送成功,topic"+topic);
            }

            @Override
            public void onError(String topic, Integer partition, Object key, Object value, Exception exception) {

            }
        });
    }
}
