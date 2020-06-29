package codegym.furama.service.impl;

import codegym.furama.model.services.DichVu;
import codegym.furama.repository.DichVuRepository;
import codegym.furama.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class newServiceImpl implements NewService {
    @Autowired
    DichVuRepository dichVuRepository;

    @Override
    public List<DichVu> findAll() {
        return null;
    }

    @Override
    public Optional<DichVu> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void remove(Long id) {

    }
}
