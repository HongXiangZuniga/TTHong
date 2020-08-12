package com.tthong.EngineServices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "model", path = "model")
public interface ModelRepository extends MongoRepository<Model, String> {
    public List<Model> findByid(@Param("id") String id);


}
