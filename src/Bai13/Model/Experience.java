package Bai13.Model;

import java.time.Instant;
import java.util.List;

public class Experience extends Employee{
    private Integer expInYear;
    private String proSkill;

    public Experience(String id, String fullName, String birthDay, String phone, String email, Integer employeeType, List<Certificate> certificateList, Integer expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType, certificateList);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Integer getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(Integer expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kinh nghiem: " + this.expInYear);
        System.out.println("Ki nang chuyen mon: " + this.proSkill);
    }
}
