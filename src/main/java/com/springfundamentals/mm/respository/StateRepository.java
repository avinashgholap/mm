package com.springfundamentals.mm.respository;

import com.springfundamentals.mm.model.State;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends MongoRepository<State, String> {
}
