package com.example.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * Created by zsq on 2018/3/22.
 */
@Configuration
public class JmsConfirguration {

    public static final String QUEUE_NAME = "activemq_queue";

    public static final String TOPIC_NAME = "activemq_topic";

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(QUEUE_NAME);
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(TOPIC_NAME);
    }
}
