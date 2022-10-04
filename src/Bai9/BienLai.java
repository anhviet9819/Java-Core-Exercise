package Bai9;

public class BienLai {
    private HoGiaDinh hoGiaDinh;
    private Integer chiSoDienCu;
    private Integer chiSoDienMoi;
    private Integer soTienPhaiTra;

    public BienLai(HoGiaDinh hoGiaDinh, Integer chiSoDienCu, Integer chiSoDienMoi) {
        this.hoGiaDinh = hoGiaDinh;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.soTienPhaiTra = (chiSoDienMoi - chiSoDienCu) * 5;
    }

    public HoGiaDinh getHoGiaDinh() {
        return hoGiaDinh;
    }

    public void setHoGiaDinh(HoGiaDinh hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }

    public Integer getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(Integer chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public Integer getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(Integer chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public Integer getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(Integer soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "ten chu ho=" + hoGiaDinh.getHoTenChuHo() +
                ", so nha chu ho=" + hoGiaDinh.getSoNha() +
                ", ma so cong to dien=" + hoGiaDinh.getMaSoCongToDien() +
                ", chiSoDienCu=" + chiSoDienCu +
                ", chiSoDienMoi=" + chiSoDienMoi +
                ", soTienPhaiTra=" + soTienPhaiTra +
                '}';
    }
}
