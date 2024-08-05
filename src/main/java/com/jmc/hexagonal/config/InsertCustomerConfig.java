package com.jmc.hexagonal.config;

import com.jmc.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.jmc.hexagonal.adapters.out.InsertCustomerAdapter;
import com.jmc.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.jmc.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
