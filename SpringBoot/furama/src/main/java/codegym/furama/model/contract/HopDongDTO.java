package codegym.furama.model.contract;

import codegym.furama.model.customer.Customer;
import codegym.furama.model.services.DichVu;

import java.sql.Date;

public class HopDongDTO {
    private int idHopDong;
    private Date ngayLamHopDong;
    private Date ngayKetThuc;
    private long tienDatCoc;
    private long tongTien;
    private HopDongChiTiet hopDongChiTiet;

    private Customer customer;

    private DichVu dichVu;

    public HopDongDTO() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
//
    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}
