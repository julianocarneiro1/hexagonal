package com.jmc.hexagonal.application.ports.in;

import com.jmc.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zupCode);
}
