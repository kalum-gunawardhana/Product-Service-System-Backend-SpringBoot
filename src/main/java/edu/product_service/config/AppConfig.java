package edu.product_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }

    @Bean
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
