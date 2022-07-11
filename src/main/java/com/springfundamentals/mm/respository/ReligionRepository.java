package com.springfundamentals.mm.respository;

import com.springfundamentals.mm.model.Religion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReligionRepository extends MongoRepository<Religion, String> {

    public Religion findByName(String name);
}
