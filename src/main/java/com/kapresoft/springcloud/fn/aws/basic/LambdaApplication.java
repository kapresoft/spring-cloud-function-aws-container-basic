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
	Function<String, Response> uppercase() {
		return request -> {
			final String upperCased = request.toUpperCase(Locale.getDefault());
			log.info("Upper-casing: [{}] to [{}]", request, upperCased);

			return Response.builder()
					.request(request)
					.response(upperCased)
					.build();
		};
	}

	@Bean
	Function<String, Response> lowercase() {
		return request -> {
			final String lowerCased = request.toLowerCase(Locale.getDefault());
			log.info("Lower-casing: [{}] to [{}]", request, lowerCased);
			return Response.builder()
					.request(request)
					.response(lowerCased)
					.build();
		};
	}

}
