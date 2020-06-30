package codegym.furama.model.customer;


import codegym.furama.model.contract.HopDong;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="khachhang")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idkhachhang")
    private int IDKhachHang;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="idaccount", referencedColumnName = "idaccount")
    private Account account;


    @OneToMany(mappedBy = "customer")
    private Set<HopDong> hopDongs;





    @Column(name = "loai_khach")
    private String loaiKhach;

    @Column(name="ho_ten")
    private String hoTen;

    @Column(name="ngay_sinh")
    private Date ngaySinh;

    @Column(name="gioi_tinh")
    private String gioiTinh;

    @Column(name="socmnd")
    private String soCMND;

    @Column(name="sdt")
    private String SDT;

    @Column(name="email")
    private String email;

    @Column(name="diachi")
    private String diaChi;

    public String getDateborn(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(ngaySinh);
        strDate.substring(0,9);
        return  strDate;
    }



    public int getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(int IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
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

    public Customer() {
    }
}
