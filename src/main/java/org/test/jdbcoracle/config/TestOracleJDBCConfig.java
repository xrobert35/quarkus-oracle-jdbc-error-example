package org.test.jdbcoracle.config;

import java.io.IOException;
import java.util.Map;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

import org.elasticsearch.client.Request;
import org.elasticsearch.client.RestClient;
import org.test.jdbcoracle.repository.TestEntityRepository;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class TestOracleJDBCConfig {

	@Inject
	TestEntityRepository repository;

	@Inject
	RestClient restClient;

	@Inject
	ElasticsearchClient client;

	void onStart(@Observes StartupEvent ev) {
		this.repository.findAll();
		try {
			this.restClient.performRequest( new Request( "", "" ) );
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.client.search( b -> b.q( "foo" ), Map.class );
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}