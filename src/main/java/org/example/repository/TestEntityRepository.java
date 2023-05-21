package org.example.repository;

import org.example.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity,Long> {
/*    TestEntity getById(Long id);
    List<TestEntity> getAll();*/
}
