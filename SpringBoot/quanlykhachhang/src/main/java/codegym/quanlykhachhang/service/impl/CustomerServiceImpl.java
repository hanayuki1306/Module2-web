package codegym.quanlykhachhang.service.impl;

import codegym.quanlykhachhang.model.Customer;
import codegym.quanlykhachhang.repository.CustomerRepository;
import codegym.quanlykhachhang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}