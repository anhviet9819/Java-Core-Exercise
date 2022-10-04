package Bai5;

public class PhongLoaiB extends Phong{

    public PhongLoaiB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "PhongLoaiB{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
