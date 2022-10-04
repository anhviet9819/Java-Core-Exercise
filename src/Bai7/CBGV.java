package Bai7;

public class CBGV extends Nguoi{
    private Double salary;
    private Double bonus;
    private Double phat;
    private Double realSalary;

    public CBGV(String name, Integer age, String homeTown, String id) {
        super(name, age, homeTown, id);
    }

    public CBGV(String name, Integer age, String homeTown, String id, Double salary, Double bonus, Double phat) {
        super(name, age, homeTown, id);
        this.salary = salary;
        this.bonus = bonus;
        this.phat = phat;
        this.realSalary = salary + bonus - phat;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getPhat() {
        return phat;
    }

    public void setPhat(Double phat) {
        this.phat = phat;
    }

    public Double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary() {
        this.realSalary = this.salary + this.bonus - this.phat;
    }

    @Override
    public String toString() {
        return "CBGV{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", phat=" + phat +
                ", realSalary=" + realSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
