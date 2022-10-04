package Bai4;

public class Nguoi {
    protected String name;
    protected Integer age;
    protected String job;
    protected String id;

    public Nguoi(String name, Integer age, String job, String id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
