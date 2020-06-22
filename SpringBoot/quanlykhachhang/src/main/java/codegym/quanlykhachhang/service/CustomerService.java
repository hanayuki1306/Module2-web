package codegym.quanlykhachhang.service;

import codegym.quanlykhachhang.model.Customer;

import java.util.Optional;


public interface CustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}