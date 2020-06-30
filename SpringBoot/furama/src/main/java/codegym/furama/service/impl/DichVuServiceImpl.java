package codegym.furama.service.impl;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.services.DichVu;
import codegym.furama.repository.DichVuRepository;
import codegym.furama.service.DichVuSerVice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuSerVice {
    @Autowired
    DichVuRepository dichVuRepository;

    @Override
    public Optional<DichVu> findById(int id) {
        return dichVuRepository.findById(id);
    }

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void remove(int id) {
        Optional<DichVu> dichVu = dichVuRepository.findById(id);
        if(dichVu.isPresent()){
            dichVu.get().setIsDelete(true);
            dichVuRepository.save(dichVu.get());
        }
    }
}
