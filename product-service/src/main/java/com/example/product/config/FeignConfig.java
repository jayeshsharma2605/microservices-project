package com.example.product.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options requestOptions() {
        return new Request.Options(5000, 10000);
    }

    @Bean
    public feign.RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Content-Type", "application/json");
        };
    }

    @Bean
    public feign.Retryer retryer() {
        return new feign.Retryer.Default(1000, 3000, 3);
    }
}
