package model.No_Dependency;

import model.Repository.DungSi;

public class DungSiDepTrai implements DungSi {
    String name;

    public DungSiDepTrai(String name) {
        this.name = name;
    }

    public DungSiDepTrai() {
    }

    @Override
    public String thucHienNhiemVu() {
        return "Dũng Sĩ đẹp trai dùng cung tiêu diệt rồng" ;
    }
}
