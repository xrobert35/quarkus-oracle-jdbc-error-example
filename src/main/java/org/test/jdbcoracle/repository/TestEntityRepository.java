package org.test.jdbcoracle.repository;


import org.test.jdbcoracle.entity.TestEntity;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TestEntityRepository implements PanacheRepository<TestEntity>{

    @Inject
    ElasticsearchClient elastichSearchClient;

}