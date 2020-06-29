package codegym.furama.repository;

import codegym.furama.model.services.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DichVuRepository extends JpaRepository<DichVu,Integer> {
}
