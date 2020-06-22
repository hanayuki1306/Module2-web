package codegym.quanlykhachhangphantrang.repository;


import codegym.quanlykhachhangphantrang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
