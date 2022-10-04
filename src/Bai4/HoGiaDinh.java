package Bai4;

import java.util.List;
import java.util.Set;

public class HoGiaDinh {
    protected List<Nguoi> thanhVien;
    protected String soNha;

    public HoGiaDinh(List<Nguoi> thanhVien, String soNha) {
        this.thanhVien = thanhVien;
        this.soNha = soNha;
    }

    public List<Nguoi> getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(List<Nguoi> thanhVien) {
        this.thanhVien = thanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "thanhVien=" + thanhVien +
                ", soNha='" + soNha + '\'' +
                '}';
    }
}
