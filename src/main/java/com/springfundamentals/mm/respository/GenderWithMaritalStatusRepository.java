package com.springfundamentals.mm.respository;

import com.springfundamentals.mm.model.GenderWithMaritalStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderWithMaritalStatusRepository extends MongoRepository<GenderWithMaritalStatus, String> {
}
