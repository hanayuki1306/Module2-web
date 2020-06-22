package codegym.quanlykhachhang.repository;

import codegym.quanlykhachhang.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
