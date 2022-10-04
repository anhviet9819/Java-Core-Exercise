package Bai8;

public class TheMuon {
    private String id;
    private Integer ngayMuon;
    private Integer ngayTra;
    private String bookId;
    private SinhVien sinhVienMuon;

    public TheMuon(String id, Integer ngayMuon, Integer ngayTra, String bookId, SinhVien sinhVienMuon) {
        this.id = id;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.bookId = bookId;
        this.sinhVienMuon = sinhVienMuon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Integer ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Integer getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Integer ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public SinhVien getSinhVienMuon() {
        return sinhVienMuon;
    }

    public void setSinhVienMuon(SinhVien sinhVienMuon) {
        this.sinhVienMuon = sinhVienMuon;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "id='" + id + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                ", bookId='" + bookId + '\'' +
                ", sinhVienMuon=" + sinhVienMuon.getName() + '\'' +
                ", tuoi=" + sinhVienMuon.getAge() + '\'' +
                ", lop=" +sinhVienMuon.getGrade() + '\'' +
                '}';
    }
}
