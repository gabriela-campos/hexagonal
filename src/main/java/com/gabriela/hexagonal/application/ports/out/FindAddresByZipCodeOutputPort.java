package com.gabriela.hexagonal.application.ports.out;

import com.gabriela.hexagonal.application.core.domain.Address;

public interface FindAddresByZipCodeOutputPort {

    Address find(String zipCode);
}
