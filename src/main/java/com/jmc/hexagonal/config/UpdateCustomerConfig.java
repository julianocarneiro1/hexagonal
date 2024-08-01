package com.jmc.hexagonal.config;

import com.jmc.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.jmc.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.jmc.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.jmc.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.jmc.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
