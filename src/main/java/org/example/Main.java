package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//    @Bean
//    CommandLineRunner InitDatabase(TestEntityRepository testEntityRepository) {
//
//        return args -> {
//            log.info("Preloading " + testEntityRepository.save(TestEntity.builder().id(1l).name("name1").file(new byte[]{}).build()));
//            log.info("Preloading " + testEntityRepository.save(TestEntity.builder().id(2l).name("name2").file(new byte[]{}).build()));
//        };
//    }
}