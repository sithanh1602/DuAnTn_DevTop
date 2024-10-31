package com.be.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Áp dụng cho tất cả các endpoint
                        .allowedOrigins("http://localhost:3000")  // Địa chỉ frontend của React
                        .allowedMethods("GET", "POST", "PUT", "DELETE")  // Các phương thức HTTP
                        .allowedHeaders("*");
            }
        };
    }
}
