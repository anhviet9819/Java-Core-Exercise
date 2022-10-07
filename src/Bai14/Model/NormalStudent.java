package Bai14.Model;

public class NormalStudent extends Student {
    private Integer englishScore;
    private Integer entryTestScore;

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, Integer englishScore, Integer entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    public Integer getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(Integer entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showMyInfo() {
        super.showMyInfo();
        System.out.println("Toeic score: "+this.englishScore);
        System.out.println("Entry test score: "+this.entryTestScore);
    }
}
