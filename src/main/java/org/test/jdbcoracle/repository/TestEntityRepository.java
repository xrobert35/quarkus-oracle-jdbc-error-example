package org.test.jdbcoracle.repository;

import org.test.jdbcoracle.entity.TestEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestEntityRepository implements PanacheRepository<TestEntity>{
}