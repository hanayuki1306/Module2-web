package codegym.furama.model.services;

import codegym.furama.model.contract.HopDong;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="dichvu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddichvu")
    private int idDichVu;

    
    @Column(name="tendichvu")
    private String tenDichVu;

    @Column(name="dientich")
    private int dienTich;

    @Column(name="sotang")
    private int soTang;

    @Column(name="chiphithue")
    private long chiPhiThue;

    @Column(name="trangthai")
    private String trangThai;
    //kha dung hoac ko
    @Column(name="loaidichvu")
    private String loaiDichVu;
    //villa house room
    @Column(name = "kieuthue")
    private String kieuThue;
    // ngay gio thang nam

    @OneToMany(mappedBy = "dichVu")
    private Set<ServiceQueue> serviceQueues;

    @Column(name="isdelete")
    private Boolean isDelete = false;

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean delete) {
        isDelete = delete;
    }

    @OneToMany(mappedBy = "dichVu")
    private Set<HopDong> hopDongs;

    public DichVu() {
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public long getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(long chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
