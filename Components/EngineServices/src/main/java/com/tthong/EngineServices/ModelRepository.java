package com.tthong.EngineServices;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "model", path = "model")
public interface ModelRepository extends MongoRepository<Model, String> {
    List<Model> findByid(@Param("id") String id);
}
