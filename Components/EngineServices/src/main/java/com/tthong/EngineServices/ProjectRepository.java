package com.tthong.EngineServices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "project", path = "project")
public interface ProjectRepository extends MongoRepository<Project, String> {
    public List<Project> findByid(@Param("id") String id);


}
