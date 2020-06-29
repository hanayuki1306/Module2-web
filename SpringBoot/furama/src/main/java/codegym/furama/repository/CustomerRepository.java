package codegym.furama.repository;

import codegym.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CustomerRepository extends JpaRepository<Customer, Integer> {
     Page<Customer> findAllByHoTenContaining(String hoTen, Pageable pageable);
}
