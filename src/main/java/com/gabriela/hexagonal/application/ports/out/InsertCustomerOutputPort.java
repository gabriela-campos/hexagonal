package com.gabriela.hexagonal.application.ports.out;

import com.gabriela.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
