package Bai1;

public class CongNhan extends CanBo{
    private Integer level;

    public CongNhan() {
    }

    public CongNhan(Integer level) {
        this.level = level;
    }

    public CongNhan(String name, Integer age, String gender, String address, Integer level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
