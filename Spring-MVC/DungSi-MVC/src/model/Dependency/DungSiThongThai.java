package model.Dependency;


import model.Repository.DungSi;

public class DungSiThongThai implements DungSi {
    private NhiemVu nhiemvu;


    public DungSiThongThai(NhiemVu nhiemvu) {
        this.nhiemvu = nhiemvu;
    }

    public String thucHienNhiemVu() {
        return nhiemvu.thuchien();
    }

}
