package Bai7;

public class Nguoi {
    protected String name;
    protected Integer age;
    protected String homeTown;
    protected String id;

    public Nguoi(String name, Integer age, String homeTown, String id) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
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
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id=" + id +
                '}';
    }
}
