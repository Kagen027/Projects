package com.homework.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.homework.repo")
@EntityScan(basePackages = "com.homework.entity")
public class applicationConfig {
    
}
