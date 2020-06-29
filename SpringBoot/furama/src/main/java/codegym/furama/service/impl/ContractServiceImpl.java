package codegym.furama.service.impl;

import codegym.furama.model.contract.HopDong;
import codegym.furama.model.contract.HopDongChiTiet;
import codegym.furama.model.contract.HopDongDTO;
import codegym.furama.model.customer.Customer;
import codegym.furama.model.customer.CustomerDTO;
import codegym.furama.model.services.DichVu;
import codegym.furama.repository.ContractDetailRepository;
import codegym.furama.repository.ContractRepository;
import codegym.furama.service.ContractService;
import codegym.furama.service.CustomerService;
import codegym.furama.service.DichVuSerVice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Autowired
    DichVuSerVice dichVuSerVice;


    @Override
    public void save(HopDongDTO hopDongDTO) {
        HopDong hopDong = new HopDong();
        HopDongChiTiet hopDongChiTiet = new HopDongChiTiet();

        hopDongChiTiet.setGia(hopDongDTO.getHopDongChiTiet().getGia());
        hopDongChiTiet.setSoLuong(hopDongDTO.getHopDongChiTiet().getSoLuong());
        hopDongChiTiet.setTrangThai(hopDongDTO.getHopDongChiTiet().getTrangThai());
        hopDongChiTiet.setTenDichVuDiKem(hopDongDTO.getHopDongChiTiet().getTenDichVuDiKem());

        contractDetailRepository.save(hopDongChiTiet);


        Optional<DichVu> dichVu = dichVuSerVice.findById(hopDongDTO.getDichVu().getIdDichVu());
        if(dichVu.isPresent()){
            hopDong.setDichVu(dichVu.get());
        }

        hopDong.setHopDongChiTiet(hopDongChiTiet);
        hopDong.setNgayLamHopDong(hopDongDTO.getNgayLamHopDong());
        hopDong.setNgayKetThuc(hopDongDTO.getNgayKetThuc());
        hopDong.setTienDatCoc(hopDongDTO.getTienDatCoc());
        hopDong.setTongTien(hopDongDTO.getTongTien());


        Optional<Customer> customer = customerService.findById(hopDongDTO.getCustomer().getIDKhachHang());
        if(customer.isPresent()){
            hopDong.setCustomer(customer.get());
        }


        //findbyid Customer (khachhang)
//        Page<Customer> customers = customerRepository.findAllByHoTenContainingAndSoCMND(hopDongDTO.getCustomer().getHoTen(),hopDongDTO.getCustomer().getSoCMND(), pageable );

        contractRepository.save(hopDong);

    }


}
