package com.engineering.restapi.projectlistbackenddatarest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectListRepo extends MongoRepository<ProjectList, String> {
    // Define custom query methods if needed

}