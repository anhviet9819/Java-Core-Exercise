package Bai6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();
        while (true) {
            System.out.println("Chuong trinh quan ly thong tin hoc sinh");
            System.out.println("Enter 1: Them hoc sinh");
            System.out.println("Enter 2: In thong tin hoc sinh 20 tuoi");
            System.out.println("Enter 3: In thong tin hoc sinh 23 tuoi va que DN");
            System.out.println("Enter 4: In thong tin tat ca hoc sinh");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.println("Nhap vao thong tin hoc sinh");
                    System.out.print("Nhap vao ten hoc sinh: ");
                    String name = sc.nextLine();
                    System.out.printf("Nhap vao tuoi: ");
                    String age = sc.nextLine();
                    Integer age1;
                    try {
                        age1 = Integer.parseInt(age);
                    } catch (Exception e) {
                        System.out.println("Tuoi ban nhap vao khong hop le!");
                        return;
                    }
                    if (age1 < 0) {
                        System.out.println("Tuoi ban nhap vao khong hop le!");
                        return;
                    }
                    System.out.print("Nhap vao lop: ");
//                    sc.nextLine();
                    String grade = sc.nextLine();
                    System.out.print("Nhap vao que quan: ");
//                    sc.nextLine();
                    String homeTown = sc.nextLine();
                    manageStudent.addStudent(new Student(name, age1, homeTown, grade));
                    break;
                }
                case "2": {
                    manageStudent.show20YearsOldStudent();
                    break;
                }
                case "3": {
                    manageStudent.show23YearsOldDNHomeTownStudent();
                    break;
                }
                case "4": {
                    manageStudent.showStudentInfo();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Lua chon ban nhap khong hop le!");
                    continue;
            }
        }
    }
}
