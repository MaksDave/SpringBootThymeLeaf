package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.TestEntity;
import org.example.exception.TestEntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<TestEntity> catchTestEntityNotFoundException(Exception exception) {
        log.error("Entity not found by advice!");
        return new ResponseEntity<>(TestEntity.builder().id(0L).name(HttpStatus.BAD_REQUEST.toString()).file(new byte[]{}).build(),HttpStatus.BAD_REQUEST);
    }
}
