package com.engineering.restapi.projectlistbackenddatarest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectListService {
    private final ProjectListRepo repository;

    @Autowired
    public ProjectListService(ProjectListRepo repository) {
        this.repository = repository;
    }

    public ProjectList save(ProjectList entity) {
        return repository.save(entity);
    }

}
