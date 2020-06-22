package codegym.quanlykhachhangphantrang.service;

import codegym.quanlykhachhangphantrang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining (String firstname, Pageable pageable);

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
