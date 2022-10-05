package Bai13.Model;

import java.time.Instant;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private Integer semester;
    private String universityName;

    public Intern(String id, String fullName, String birthDay, String phone, String email, Integer employeeType, List<Certificate> certificateList, String majors, Integer semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employeeType, certificateList);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Chuyen nganh: " + this.majors);
        System.out.println("Hoc ki dang hoc: " + this.semester);
        System.out.println("Truong dai hoc: " + this.universityName);
    }
}
