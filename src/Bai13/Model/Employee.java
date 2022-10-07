package Bai13.Model;

import javax.annotation.Generated;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
    protected String id;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected Integer employeeType;
    public static Integer employeeCount = 0;
    List<Certificate> certificateList;

//    public Employee(String id, String fullName, String birthDay, String phone, String email, Integer employeeType) {
//        this.id = id;
//        this.fullName = fullName;
//        this.birthDay = birthDay;
//        this.phone = phone;
//        this.email = email;
//        employeeCount++;
//        this.employeeType = employeeType;
//    }

    public Employee(String id, String fullName, String birthDay, String phone, String email, Integer employeeType, List<Certificate> certificateList) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        employeeCount++;
        this.employeeType = employeeType;
        this.certificateList = certificateList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }

    public static Integer getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(Integer employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public List<Certificate> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<Certificate> certificateList) {
        this.certificateList = certificateList;
    }

    public void showInfo() {
        System.out.println("Thong tin ca nhan: ");
        System.out.println("ID: " + this.id);
        System.out.println("Ho va ten: " + this.fullName);
        System.out.println("Ngay sinh: " + this.birthDay);
        System.out.println("Dien thoai: " + this.phone);
        System.out.println("Email: " + this.email);
        for(Certificate certi: this.certificateList){
            System.out.println("**********");
            System.out.println("Certificate ID: "+ certi.getCertificateId());
            System.out.println("Certificate name: "+ certi.getCertificateName());
            System.out.println("Certificate rank: "+ certi.getCertificateRank());
            System.out.println("Certificate date: "+ certi.getCertificateDate());
            System.out.println("**********");
        }
    }
}
