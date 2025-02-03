package com.post.it.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Configuration class definition for databases
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.post.it.repository")
public class DatabaseConfig {
}