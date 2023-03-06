package org.test.jdbcoracle.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestService {
    
    public ElasticsearchClient elastichSearchClient;

    public boolean search(){
        var uh = this.elastichSearchClient.indices();
        return uh != null;
    }

}
