package Bai12;

public class XeTai extends Xe{
    private Double trongTai;

    public XeTai(String id, String hangSanXuat, Integer namSanXuat, Double giaBan, String mauXe, Double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public Double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", id='" + id + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}
