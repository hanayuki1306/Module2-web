package model.Dependency;

import model.Repository.DungSi;

public class DungSiThongThai implements DungSi {
    private NhiemVu nhiemvu;
    @Override
    public String thucHienNhiemVu() {
        return nhiemvu.thuchien();
    }
}


