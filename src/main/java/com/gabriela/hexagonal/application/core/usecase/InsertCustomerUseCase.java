package com.gabriela.hexagonal.application.core.usecase;

import com.gabriela.hexagonal.application.core.domain.Customer;
import com.gabriela.hexagonal.application.ports.out.FindAddresByZipCodeOutputPort;
import com.gabriela.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddresByZipCodeOutputPort findAddresByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort,
                                 FindAddresByZipCodeOutputPort findAddresByZipCodeOutputPort) {
        this.findAddresByZipCodeOutputPort = findAddresByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {

        var address = findAddresByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);

    }
}
