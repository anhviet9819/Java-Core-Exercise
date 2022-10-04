package Bai5;

public class PhongLoaiC extends Phong{

    public PhongLoaiC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "PhongLoaiC{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
