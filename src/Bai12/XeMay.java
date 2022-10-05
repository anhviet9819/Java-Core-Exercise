package Bai12;

public class XeMay extends Xe{
    private Double congSuat;

    public XeMay(String id, String hangSanXuat, Integer namSanXuat, Double giaBan, String mauXe, Double congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    public Double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                ", id='" + id + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}
