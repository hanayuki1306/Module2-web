package codegym.furama.model.customer;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.sql.Date;

public class CustomerDTO implements Validator {
    private int idKhachHang;
    private String loaiKhach;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;

    private String soCMND;

    @Pattern(regexp = "(^(\\+)(84)(\\s)(9|1[2|6|8|9])+([0-9]{8}))$" , message = "must follow +84 9XXXXXXXXor +84 1XXXXXXXXX")
    private String SDT;



    @Email
    private String email;
    private String diaChi;
    private Account account;
    private String confirmPassword;

    public CustomerDTO() {
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return CustomerDTO.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDTO customer = (CustomerDTO) target;
        ValidationUtils.rejectIfEmpty(errors, "hoTen", "name.empty");
        String account = customer.getAccount().getAccount();
        if (account == ""){
            errors.rejectValue("account","account.convert");
        }

        String accountPattern = "^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$";

        if (!account.matches(accountPattern)){
            errors.rejectValue("account","account.wrongtype");
        }
    }
}
