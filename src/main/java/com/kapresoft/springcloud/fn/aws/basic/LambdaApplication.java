package com.kapresoft.springcloud.fn.aws.basic;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@Slf4j
@SpringBootApplication
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}

	@Bean
	Function<String, String> uppercase() {
		return value -> {
			final String upperCased = value.toUpperCase(Locale.getDefault());
			log.info("Upper-casing: [{}] to [{}]", value, upperCased);
			return upperCased;
		};
	}

	@Bean
	Function<String, String> lowercase() {
		return value -> {
			final String lowerCased = value.toLowerCase(Locale.getDefault());
			log.info("Lower-casing: [{}] to [{}]", value, lowerCased);
			return lowerCased;
		};
	}

}
