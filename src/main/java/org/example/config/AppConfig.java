/*
package org.example.config;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.TestEntity;
import org.example.repository.TestEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AppConfig {
    @Bean
    CommandLineRunner InitDatabase(TestEntityRepository testEntityRepository) {

        return args -> {
            log.info("Preloading " + testEntityRepository.save(TestEntity.builder().id(1L).name("name1").file(new byte[]{}).build()));
            log.info("Preloading " + testEntityRepository.save(TestEntity.builder().id(2L).name("name2").file(new byte[]{}).build()));
        };
    }
}
*/
