package com.jmc.hexagonal.adapters.out.repository;

import com.jmc.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public class CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
