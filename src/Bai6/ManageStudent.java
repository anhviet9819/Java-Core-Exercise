package Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageStudent {
    List<Student> studentList;

    public ManageStudent() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }
    public void showStudentInfo(){
        if(this.studentList.size() != 0){
            this.studentList.forEach(s -> System.out.println(s));
        }
        else {
            System.out.println("Chua co hoc sinh nao!");
        }
    }

    public void show20YearsOldStudent(){
        List<Student> studentList1 = this.studentList.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
        if(studentList1.size() != 0){
            System.out.println("Danh sach hoc sinh 20 tuoi: ");
            studentList1.forEach(s -> System.out.println(s));
        }else {
            System.out.println("Khong co hoc sinh nao 20 tuoi!");
        }
    }

    public void show23YearsOldDNHomeTownStudent(){
        List<Student> studentList1 = this.studentList.stream().filter(student -> student.getAge() == 23 & student.getHometown().equals("DN")).collect(Collectors.toList());
        if(studentList1.size() != 0){
            System.out.println("Danh sach hoc sinh 23 tuoi que DN: ");
            studentList1.forEach(s -> System.out.println(s));
        }else {
            System.out.println("Khong co hoc sinh nao 23 tuoi que DN!");
        }
    }
}
