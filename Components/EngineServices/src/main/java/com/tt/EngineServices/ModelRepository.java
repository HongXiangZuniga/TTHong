package com.tt.EngineServices;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModelRepository extends MongoRepository<Model, String> {

  public List<Model> findByid(String id);

}