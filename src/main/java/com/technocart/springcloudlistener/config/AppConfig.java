package com.technocart.springcloudlistener.config;


import com.technocart.springcloudlistener.stream.Stream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Stream.class)
public class AppConfig {
}
