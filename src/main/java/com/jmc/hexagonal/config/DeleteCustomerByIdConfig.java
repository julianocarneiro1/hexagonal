package com.jmc.hexagonal.config;

import com.jmc.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.jmc.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.jmc.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.jmc.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.jmc.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.jmc.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
