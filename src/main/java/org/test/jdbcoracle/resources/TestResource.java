package org.test.jdbcoracle.resources;



import org.test.jdbcoracle.repository.TestEntityRepository;
import org.test.jdbcoracle.service.TestService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

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
