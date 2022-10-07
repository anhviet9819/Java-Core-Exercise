package Bai14.Model;

public class GoodStudent extends Student {
    private Double gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, Double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showMyInfo() {
        super.showMyInfo();
        System.out.println("GPA: "+this.gpa);
        System.out.println("Best reward: "+this.bestRewardName);
    }
}
