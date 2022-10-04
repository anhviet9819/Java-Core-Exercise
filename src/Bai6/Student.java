package Bai6;

public class Student {
    private String name;
    private Integer age;
    private String hometown;
    private String grade;

    public Student(String name, Integer age, String hometown, String grade) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
