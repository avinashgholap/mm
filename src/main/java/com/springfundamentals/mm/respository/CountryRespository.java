package com.springfundamentals.mm.respository;

import com.springfundamentals.mm.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface CountryRespository extends MongoRepository<Country, String> {
}
