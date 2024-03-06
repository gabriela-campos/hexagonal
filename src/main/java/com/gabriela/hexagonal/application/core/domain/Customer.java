package com.gabriela.hexagonal.application.core.domain;

public class Customer {

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(String id, String name, Address address, String cnpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cnpf = cnpf;
        this.isValidCpf = isValidCpf;
    }

    private String id;

    private  String name;

    private Address address;

    private String cnpf;

    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCnpf() {
        return cnpf;
    }

    public void setCnpf(String cnpf) {
        this.cnpf = cnpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
