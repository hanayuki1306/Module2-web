package codegym.furama.service;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.services.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;


public interface DichVuSerVice {

    Optional<DichVu> findById(int id);
    Page<DichVu> findAll(Pageable pageable);
    void save(DichVu dichVu);
    void remove(int id);

}
