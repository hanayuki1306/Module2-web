package codegym.furama.repository;

import codegym.furama.model.contract.HopDongChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailRepository extends JpaRepository<HopDongChiTiet,Integer> {
}
