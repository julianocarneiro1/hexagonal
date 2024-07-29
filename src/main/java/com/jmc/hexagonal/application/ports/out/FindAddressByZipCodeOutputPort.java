package com.jmc.hexagonal.application.ports.out;

import com.jmc.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find (String zipCode);
}
