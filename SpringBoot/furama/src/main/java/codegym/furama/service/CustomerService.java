package codegym.furama.service;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.customer.CustomerDTO;
import codegym.furama.model.customer.Login;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.sql.Date;

import java.util.Optional;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(int id);
    Page<Customer> findByName(String name,Pageable pageable);
    void saveDTO(CustomerDTO customerDTO);
    void save(Customer customer);
    void remove(int id);
    String checkLogin(Login login);
    Page<Customer> findBy3Field(String name, String cmnd, Date birthday,Pageable pageable);


}
