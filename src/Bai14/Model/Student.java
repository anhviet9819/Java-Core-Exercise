package Bai14.Model;

public class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public void showMyInfo(){
        System.out.println("*********************");
        System.out.println("Student info: ");
        System.out.println("Full name: "+this.fullName);
        System.out.println("Date of birth: "+this.doB);
        System.out.println("Sex: "+this.sex);
        System.out.println("Phone number: "+this.phoneNumber);
        System.out.println("University name: "+this.universityName);
        System.out.println("Grade level: "+this.gradeLevel);
    }
}

