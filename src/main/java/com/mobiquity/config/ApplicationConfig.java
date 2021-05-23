package com.mobiquity.config;

import com.mobiquity.service.FileServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    private static Logger log = LoggerFactory.getLogger(ApplicationConfig.class);

    @Bean
    public FileServiceImpl fileService() {
        log.info("Service Bean Loaded for {}", FileServiceImpl.class);
        return new FileServiceImpl();
    }
}