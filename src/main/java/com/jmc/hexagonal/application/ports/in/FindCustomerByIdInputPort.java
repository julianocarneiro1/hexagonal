package com.jmc.hexagonal.application.ports.in;

import com.jmc.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}