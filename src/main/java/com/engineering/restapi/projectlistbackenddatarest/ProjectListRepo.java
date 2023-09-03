package com.engineering.restapi.projectlistbackenddatarest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "list", path = "list")
public interface ProjectListRepo extends MongoRepository<ProjectList, String> {
    // Define custom query methods if needed

}