package Bai5;

public class PhongLoaiA extends Phong{

    public PhongLoaiA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "PhongLoaiA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
