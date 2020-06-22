package codegym.quanlykhachhangphantrang.service.impl;

import codegym.quanlykhachhangphantrang.model.Customer;
import codegym.quanlykhachhangphantrang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import codegym.quanlykhachhangphantrang.repository.CustomerRepository;

import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {

        return customerRepository.findAllByFirstNameContaining(firstname,pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void remove(Long id) {

    }

}
