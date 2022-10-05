package Bai13.Model;

import java.time.Instant;
import java.util.List;

public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String id, String fullName, String birthDay, String phone, String email, Integer employeeType, List<Certificate> certificateList, String graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, employeeType, certificateList);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thoi gian tot nghiep: " + this.graduationDate);
        System.out.println("Loai tot nghiep: " + this.graduationRank);
        System.out.println("Truong dai hoc: " + this.education);
    }
}
