package Bai7;

import Bai6.ManageStudent;
import Bai6.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCBGV quanLyCBGV = new QuanLyCBGV();
        while (true) {
            System.out.println("Chuong trinh quan ly thong tin CBGV");
            System.out.println("Enter 1: Them CBGV");
            System.out.println("Enter 2: Xoa CBGV");
            System.out.println("Enter 3: Hien thi danh sach CBGV");
            System.out.println("Enter 4: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.println("Nhap vao thong tin CBGV");
                    System.out.print("Nhap vao ten CBGV: ");
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
                    System.out.print("Nhap vao que quan: ");
                    String homeTown = sc.nextLine();
                    System.out.print("Nhap vao ma so giao vien: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap vao luong cung: ");
                    Double salary = sc.nextDouble();
                    System.out.print("Nhap vao luong thuong: ");
                    Double bonus = sc.nextDouble();
                    System.out.print("Nhap vao luong phat: ");
                    Double phat = sc.nextDouble();
                    quanLyCBGV.addCBGV(new CBGV(name, age1, homeTown, id, salary, bonus, phat));
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao ma so giao vien ban muon xoa: ");
                    String id = sc.nextLine();
                    quanLyCBGV.deleteCBGVById(id);
                    break;
                }
                case "3": {
                    quanLyCBGV.showInfoCBGV();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Lua chon ban nhap khong hop le!");
                    continue;
            }
        }
    }
}