package com.example.demo.activemqTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zsq on 2018/3/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {

    @Autowired
    private JmsSender sender;

    @Autowired
    private  JmsReceiver receiver;

    @Test
    public void testSendByQueue() {
        for (int i = 1; i < 6; i++) {
            this.sender.sendByQueue("hello activemq queue " + i);
        }
    }

    @Test
    public void testSendByTopic() {
        for (int i = 1; i < 6; i++) {
            this.sender.sendByTopic("hello activemq topic " + i);
        }
    }
}
