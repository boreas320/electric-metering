package com.utilitybilling.electricmetering.mailsender.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 12:41
 */
@Component
public class MessageListener {
    private static Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    @Autowired
    private JavaMailSender javaMailSender;

    @KafkaListener(topics = "processed_metering_data")
    public void processMessage(String content) {
        LOGGER.info("receive topic={} message:{}", "processed_metering_data", content);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom();
        simpleMailMessage.setReplyTo();
        simpleMailMessage.setTo();
        simpleMailMessage.setTo();
        simpleMailMessage.setCc();
        simpleMailMessage.setCc();
        simpleMailMessage.setBcc();
        simpleMailMessage.setBcc();
        simpleMailMessage.setSentDate();
        simpleMailMessage.setSubject();
        simpleMailMessage.setText();

    }
}
