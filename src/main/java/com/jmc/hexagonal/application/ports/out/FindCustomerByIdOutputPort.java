package com.jmc.hexagonal.application.ports.out;

import com.jmc.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}