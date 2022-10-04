package Bai1;

public class KySu extends CanBo{
    private String major;

    public KySu() {
    }

    public KySu(String major) {
        this.major = major;
    }

    public KySu(String name, Integer age, String gender, String address, String major) {
        super(name, age, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
