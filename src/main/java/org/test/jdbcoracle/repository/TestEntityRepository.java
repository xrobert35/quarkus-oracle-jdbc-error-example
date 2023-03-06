package org.test.jdbcoracle.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.test.jdbcoracle.entity.TestEntity;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TestEntityRepository implements PanacheRepository<TestEntity>{

    @Inject
    ElasticsearchClient elastichSearchClient;

}