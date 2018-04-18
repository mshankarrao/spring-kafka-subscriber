package com.technocart.springcloudlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaListeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaListeningApplication.class, args);
	}
}
