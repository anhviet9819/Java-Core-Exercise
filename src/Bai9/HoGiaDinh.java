package Bai9;

public class HoGiaDinh {
    private String hoTenChuHo;
    private String soNha;
    private String maSoCongToDien;

    public HoGiaDinh(String hoTenChuHo, String soNha, String maSoCongToDien) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongToDien = maSoCongToDien;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongToDien() {
        return maSoCongToDien;
    }

    public void setMaSoCongToDien(String maSoCongToDien) {
        this.maSoCongToDien = maSoCongToDien;
    }

}
