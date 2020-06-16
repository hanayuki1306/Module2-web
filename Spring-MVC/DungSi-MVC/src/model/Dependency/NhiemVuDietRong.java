package model.Dependency;

import java.io.PrintStream;

public class NhiemVuDietRong implements NhiemVu {
    private PrintStream stream;
    public NhiemVuDietRong(PrintStream stream) {
        this.stream = stream;
    }


    @Override
    public String thuchien() {
        return "dung thuoc doc de dietrong";
    }
}
