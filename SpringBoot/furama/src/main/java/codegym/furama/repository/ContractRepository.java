package codegym.furama.repository;

import codegym.furama.model.contract.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<HopDong, Integer> {
}
