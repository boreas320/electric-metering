package com.utilitybilling.electricmetering.dataprocess.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 15:13
 */
@Component
public class MessageListener {

    private static Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @KafkaListener(topics = "metering_data")
    public void processMessage(String content) {
        LOGGER.info("receive topic={} message:{}", "metering_data", content);
        kafkaTemplate.send("processed_metering_data", content);
    }
}
