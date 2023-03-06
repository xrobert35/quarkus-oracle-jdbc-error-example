package org.test.jdbcoracle.config;

import java.io.IOException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.elasticsearch.client.Request;
import org.elasticsearch.client.RestClient;
import org.test.jdbcoracle.repository.TestEntityRepository;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class TestOracleJDBCConfig {

    @Inject
    TestEntityRepository repository;

    @Inject
    RestClient restClient;

    @Inject
    ObjectMapper mapper;

    @Singleton
    public ElasticsearchClient initClient(RestClient client){
        ElasticsearchTransport transport = new RestClientTransport(client, new JacksonJsonpMapper(mapper));
        return new ElasticsearchClient(transport);
    }

    void onStart(@Observes StartupEvent ev) {         
        this.repository.findAll();
        new ElasticsearchClient(null);
        try {
            this.restClient.performRequest(new Request("", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}