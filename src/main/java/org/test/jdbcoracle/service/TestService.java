package org.test.jdbcoracle.service;

import javax.enterprise.context.ApplicationScoped;

import co.elastic.clients.elasticsearch.ElasticsearchClient;

@ApplicationScoped
public class TestService {
    
    public ElasticsearchClient elastichSearchClient;

    public boolean search(){
        var uh = this.elastichSearchClient.indices();
        return uh != null;
    }

}
