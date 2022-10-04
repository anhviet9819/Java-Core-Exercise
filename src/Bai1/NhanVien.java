package Bai1;

public class NhanVien extends CanBo{
    private String job;

    public NhanVien(String job) {
        this.job = job;
    }

    public NhanVien(String name, Integer age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public NhanVien() {
    }

    public NhanVien(String name, Integer age, String gender, String address) {
        super(name, age, gender, address);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
