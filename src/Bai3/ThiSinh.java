package Bai3;

public class ThiSinh {
    protected String sbd;
    protected String hoten;
    protected String diaChi;
    protected Integer mucUuTien;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(Integer mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public ThiSinh(String sbd, String hoten, String diaChi, Integer mucUuTien) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }
}
