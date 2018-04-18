package com.technocart.springcloudlistener.listener;

import com.technocart.springcloudlistener.domain.Message;
import com.technocart.springcloudlistener.stream.Stream;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MessageListener {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @StreamListener(Stream.INPUT)
    public void handleGreetings(@Payload Message message) {
        LOGGER.info("Received greetings: {}"+message);
    }
}
