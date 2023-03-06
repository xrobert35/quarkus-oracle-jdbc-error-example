package org.test.jdbcoracle.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.test.jdbcoracle.repository.TestEntityRepository;
import org.test.jdbcoracle.service.TestService;

@Path("/")
public class TestResource {
    
    @Inject
    TestService testService;

    @Inject
    TestEntityRepository testEntityRepository;

    @GET
    public Response uhuh(){
        testService.search();
        testEntityRepository.count();
        return null;
    }
}
