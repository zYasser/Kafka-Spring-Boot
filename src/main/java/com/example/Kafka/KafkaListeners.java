package com.example.Kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "Yasser" , groupId = "foo")
    void listen(String data){
        System.out.println("Listeners Received = " + data);
    }
}
