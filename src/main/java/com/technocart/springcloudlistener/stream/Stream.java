package com.technocart.springcloudlistener.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Stream {
    String INPUT = "greetings-in";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();

}
