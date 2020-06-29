package codegym.furama.service;



import codegym.furama.model.services.DichVu;

import java.util.List;
import java.util.Optional;

public interface NewService {
    List<DichVu> findAll();
    Optional<DichVu> findById(Long id);
    void save(DichVu dichVu);

    void remove(Long id);
}
