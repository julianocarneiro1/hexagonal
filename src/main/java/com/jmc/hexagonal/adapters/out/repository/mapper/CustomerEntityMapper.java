package com.jmc.hexagonal.adapters.out.repository.mapper;

import com.jmc.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.jmc.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
