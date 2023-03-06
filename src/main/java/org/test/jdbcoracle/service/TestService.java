package org.test.jdbcoracle.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TestService {
    
    @Inject
    public ElasticsearchClient elastichSearchClient;

    public boolean search(){
        var uh = this.elastichSearchClient.indices();
        return uh != null;
    }

}
