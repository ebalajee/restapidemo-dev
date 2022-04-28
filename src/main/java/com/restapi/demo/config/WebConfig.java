package com.restapi.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.DateFormat;

@Configuration
public class WebConfig 
{
    @Bean
    public MappingJackson2HttpMessageConverter customJson() {
        return new MappingJackson2HttpMessageConverter(
                new Jackson2ObjectMapperBuilder()
                        .indentOutput(true)
                        .serializationInclusion(JsonInclude.Include.NON_NULL)
                        .dateFormat(DateFormat.getDateTimeInstance())
                        .autoDetectFields(true)
                        .build()
        );
    }
}