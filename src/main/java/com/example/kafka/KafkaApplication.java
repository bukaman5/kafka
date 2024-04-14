package com.example.kafka;

import org.apache.kafka.common.protocol.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}
	@Bean
	public Consumer<String> consumer(){
		return message -> System.out.println("Message received :: " + message.toUpperCase());
	}
}
