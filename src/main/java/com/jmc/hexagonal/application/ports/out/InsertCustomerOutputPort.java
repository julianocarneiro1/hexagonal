package com.jmc.hexagonal.application.ports.out;

import com.jmc.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
