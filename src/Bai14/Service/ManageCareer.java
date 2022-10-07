package Bai14.Service;

import Bai13.Model.Employee;
import Bai14.Model.GoodStudent;
import Bai14.Model.NormalStudent;
import Bai14.Model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManageCareer {
    public List<Student> studentList;
    public List<GoodStudent> goodStudentList;
    public List<NormalStudent> normalStudentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public ManageCareer() {
        this.studentList = new ArrayList<>();
        this.goodStudentList = new ArrayList<>();
        this.normalStudentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public List<Student> searchStudent(String name) {
        List<Student> studentSearchList = this.studentList.stream().filter(student -> student.getFullName().equals(name)).collect(Collectors.toList());
        return studentSearchList;
    }

    public void showAllGoodStudent(){
        List<Student> students = this.studentList.stream().filter(student -> student.getGradeLevel().equals("good")).collect(Collectors.toList());
        students.forEach(student -> {
            System.out.println("Good student info:");
            student.showMyInfo();
            System.out.println("***********************************");
        });
    }

    public void showAllNormalStudent(){
        List<Student> students = this.studentList.stream().filter(student -> student.getGradeLevel().equals("normal")).collect(Collectors.toList());
        students.forEach(student -> {
            System.out.println("Normal student info:");
            student.showMyInfo();
            System.out.println("***********************************");
        });
    }

    public void showAllStudent(){
        this.studentList.forEach(student -> {
            System.out.println("Student info:");
            student.showMyInfo();
            System.out.println("***********************************");
        });
    }

    public void manageStudentCareer(Integer amountStudent) {
        List<Student> goodStudentList = this.studentList.stream().filter(student -> student.getGradeLevel().equals("good")).collect(Collectors.toList());// lay danh sach sv gioi
        List<GoodStudent> goodStudentList1 = (List<GoodStudent>) ((List<?>) goodStudentList); //downcasting
        List<GoodStudent> goodStudentListSortedByGpa = goodStudentList1.stream().sorted(Comparator.comparingDouble(GoodStudent::getGpa).reversed()).collect(Collectors.toList());//sap xep theo GPA
        List<GoodStudent> goodStudentListSortedByName = goodStudentListSortedByGpa.stream().sorted((o1, o2) -> {
            if(o1.getGpa() == o2.getGpa()){
                return o2.getFullName().compareTo(o1.getFullName());
            }
            return 0;
        }).collect(Collectors.toList());//sap xep theo ten

        List<Student> normalStudentList = this.studentList.stream().filter(student -> student.getGradeLevel().equals("normal")).collect(Collectors.toList());
        List<NormalStudent> normalStudentList1 = (List<NormalStudent>) ((List<?>) normalStudentList); //downcasting
        List<NormalStudent> normalStudentListSortedByEntryTestScore = normalStudentList1.stream().sorted(Comparator.comparing(NormalStudent::getEntryTestScore)).collect(Collectors.toList());//sap xep theo entry test score
        List<NormalStudent> normalStudentListSortedByToeicScore = normalStudentListSortedByEntryTestScore.stream().sorted(
                (o1, o2) -> {
                    if(o1.getEntryTestScore() == o2.getEntryTestScore()){
                        return o1.getEnglishScore() - o2.getEnglishScore();
                    }
                    return 0;
                }
        ).collect(Collectors.toList());//sap xep theo toeic score
        List<NormalStudent> normalStudentListSortedByName = normalStudentListSortedByToeicScore.stream().sorted(
                (o1, o2) -> {
                    if(o1.getEnglishScore() == o2.getEnglishScore()){
                        return o1.getFullName().compareTo(o2.getFullName());
                    }
                    return 0;
                }
        ).collect(Collectors.toList());//sap xep theo ten

        Integer goodStudentAmount = goodStudentListSortedByName.size();
        Integer normalStudentAmount = normalStudentListSortedByName.size();

        if(goodStudentAmount >= amountStudent){
            System.out.println("The list of successful candidates is: ");
            for(int i = 0; i < amountStudent; i++){
                goodStudentListSortedByName.get(0).showMyInfo();
                System.out.println("***************************");
            }
        } else {
            System.out.println("The list of successful candidates is: ");
            for(int j = 0; j < goodStudentAmount; j++){
                goodStudentListSortedByName.get(j).showMyInfo();
                System.out.println("***************************");
            }
            if(normalStudentAmount != 0){
                for(int k = 0; k < amountStudent - goodStudentAmount; k++){
                    normalStudentListSortedByName.get(k).showMyInfo();
                    System.out.println("***************************");
                }
            }
        }
    }
}
