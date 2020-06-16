package model.Dependency;

import java.io.PrintStream;

public class HoTong implements NhiemVu {
    private PrintStream stream;
    public HoTong(PrintStream stream){
        this.stream = stream;
    }

    public HoTong() {
    }

    @Override
    public String thuchien() {
        return "Dung si Nao to Ho tong cong chua ";
    }
}
