package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.TestEntity;
import org.example.repository.TestEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TestEntityService {

 private final TestEntityRepository testEntityRepository;
    public Optional<TestEntity> getById(Long id){
        if (id==null)throw new IllegalArgumentException("ShitHappens!");
        return testEntityRepository.findById(id);
    }
    public List<TestEntity> getAll(){
        return testEntityRepository.findAll();
    }
}
