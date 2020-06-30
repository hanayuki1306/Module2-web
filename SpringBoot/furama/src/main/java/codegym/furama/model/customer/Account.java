package codegym.furama.model.customer;

import codegym.furama.model.customer.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="account")
public class Account {
    @Id
    @Column(name="idaccount")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdAccount;

    @OneToOne(mappedBy = "account")
    private Customer customer;


    @Column(name="account")
    String account;


    @Column(name= "password")
    String password;

    public Account() {
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
