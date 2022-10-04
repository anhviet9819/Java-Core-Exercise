package Bai5;

public class Khach {
    private String name;
    private Integer age;
    private String id;
    private Phong roomRent;
    private Integer dayRent;

    public Khach(String name, Integer age, String id, Phong roomRent, Integer dayRent) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.roomRent = roomRent;
        this.dayRent = dayRent;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Phong getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(Phong roomRent) {
        this.roomRent = roomRent;
    }

    public Integer getDayRent() {
        return dayRent;
    }

    public void setDayRent(Integer dayRent) {
        this.dayRent = dayRent;
    }

    @Override
    public String toString() {
        return "Khach{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", roomRent=" + roomRent +
                ", dayRent=" + dayRent +
                '}';
    }
}
