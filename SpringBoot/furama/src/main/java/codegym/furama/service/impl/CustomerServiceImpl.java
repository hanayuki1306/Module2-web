package codegym.furama.service.impl;

import codegym.furama.model.customer.Account;
import codegym.furama.model.customer.Customer;
import codegym.furama.model.customer.CustomerDTO;
import codegym.furama.model.customer.Login;
import codegym.furama.repository.AccountRepository;
import codegym.furama.repository.CustomerRepository;
import codegym.furama.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AccountRepository accountRepository;


    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Page<Customer> findByName(String name,Pageable pageable) {
        return customerRepository.findAllByHoTenContaining(name,pageable);
    }


    @Override
    public void saveDTO(CustomerDTO customerDTO) {
        if(customerDTO.getAccount().getPassword().equals(customerDTO.getConfirmPassword())){
            Customer customer= new Customer();
            customer.setHoTen(customerDTO.getHoTen());
            customer.setNgaySinh(customerDTO.getNgaySinh());
            customer.setDiaChi(customerDTO.getDiaChi());
            customer.setGioiTinh(customerDTO.getGioiTinh());
            customer.setSoCMND(customerDTO.getSoCMND());
            customer.setSDT(customerDTO.getSDT());
            customer.setEmail(customerDTO.getEmail());
            customer.setLoaiKhach(customerDTO.getLoaiKhach());

            Account account = new Account();
            account.setAccount(customerDTO.getAccount().getAccount());
            account.setPassword(customerDTO.getAccount().getPassword());
            customer.setAccount(account);
            customerRepository.save(customer);
        }
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }


    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public String checkLogin(Login login) {
        List<Account> listAccount = accountRepository.findAll();
        for (Account account: listAccount){
            if(account.getAccount().equals(login.getAccount()) && account.getPassword().equals(login.getPassword())){
                return "views/success";
            }
        }
        return "views/error";
    }
}