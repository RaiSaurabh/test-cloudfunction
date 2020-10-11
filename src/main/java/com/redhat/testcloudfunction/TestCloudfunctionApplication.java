package com.redhat.testcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class TestCloudfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudfunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> sendandreceive() {
		return input -> input;
	}

	@Bean
	public Consumer<String> send() {
		return input -> System.out.println("Input Received is: " + input);
	}

	@Bean
	public Supplier<String> hello() {
		System.out.println("Hello was requested......");
		return () -> "Hello There......";
	}
}
