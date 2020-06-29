package codegym.furama.model.contract;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.services.DichVu;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name ="hopdong")
public class HopDong {
    @Id
    @Column(name="idhopdong")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHopDong;

    @Column(name="ngaylamhopdong")
    private Date ngayLamHopDong;

    @Column(name="ngayketthuc")
    private Date ngayKetThuc;

    @Column(name="tiendatcoc")
    private long tienDatCoc;

    @Column(name="tongtien")
    private long tongTien;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idhopdongchitiet",referencedColumnName = "idhopdongchitiet")
    private HopDongChiTiet hopDongChiTiet;


    @ManyToOne
    @JoinColumn(name="idkhachhang",nullable = false)
    private Customer customer;


    @ManyToOne
    @JoinColumn(name="iddichvu")
//    nullable = false
    private DichVu dichVu;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public HopDong() {
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public long getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(long tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public HopDongChiTiet getHopDongChiTiet() {
        return hopDongChiTiet;
    }

    public void setHopDongChiTiet(HopDongChiTiet hopDongChiTiet) {
        this.hopDongChiTiet = hopDongChiTiet;
    }
}
