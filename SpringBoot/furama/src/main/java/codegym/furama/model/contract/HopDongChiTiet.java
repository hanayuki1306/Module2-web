package codegym.furama.model.contract;

import codegym.furama.model.customer.Customer;

import javax.persistence.*;

@Entity
public class HopDongChiTiet {
    @Id
    @Column(name="idhopdongchitiet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHopDongChiTiet;

//    @Column(name="idhopdong")
//    private  int idHopDong;
    @OneToOne(mappedBy = "hopDongChiTiet")
    private HopDong hopDong;



    private String tenDichVuDiKem;
    private int SoLuong;
    private Long gia;
    private String trangThai;

    public HopDongChiTiet() {
    }

    public int getIdHopDongChiTiet() {
        return idHopDongChiTiet;
    }

    public void setIdHopDongChiTiet(int idHopDongChiTiet) {
        this.idHopDongChiTiet = idHopDongChiTiet;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public Long getGia() {
        return gia;
    }

    public void setGia(Long gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
