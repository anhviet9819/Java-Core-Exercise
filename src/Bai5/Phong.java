package Bai5;

public class Phong {
    protected String category;
    protected Integer price;

    public Phong(String category, Integer price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
