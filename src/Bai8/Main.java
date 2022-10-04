package Bai8;

import Bai7.CBGV;
import Bai7.QuanLyCBGV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySachMuon quanLySachMuon = new QuanLySachMuon();
        while (true) {
            System.out.println("Chuong trinh quan ly thong tin the muon sach");
            System.out.println("Enter 1: Them the muon");
            System.out.println("Enter 2: Xoa the muon");
            System.out.println("Enter 3: Hien thi danh sach the muon");
            System.out.println("Enter 4: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.println("Nhap vao thong tin the muon sach");
                    System.out.print("Nhap vao ma phieu muon: ");
                    String cardId = sc.nextLine();
                    Integer ngayMuon;
                    do {
                        System.out.print("Nhap vao ngay muon sach: ");
                        ngayMuon = sc.nextInt();
                        if (ngayMuon < 1 || ngayMuon > 31) {
                            System.out.println("Ngay muon sach khong hop le!");
                        }
                    } while (ngayMuon < 1 || ngayMuon > 31);
                    Integer ngayTra;
                    do {
                        System.out.print("Nhap vao ngay tra sach: ");
                        ngayTra = sc.nextInt();
                        if (ngayTra < 1 || ngayTra > 31) {
                            System.out.println("Ngay tra sach khong hop le!");
                        }
                    } while (ngayTra < 1 || ngayTra > 31);
                    sc.nextLine();
                    System.out.print("Nhap vao ma sach muon: ");
                    String bookId = sc.nextLine();
                    System.out.printf("Nhap vao ten sinh vien muon: ");
                    String name = sc.nextLine();
                    System.out.printf("Nhap vao tuoi sinh vien muon: ");
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
                    System.out.print("Nhap vao lop sinh vien: ");
                    String grade = sc.nextLine();
                    SinhVien sinhVien = new SinhVien(name, grade, age1);
                    quanLySachMuon.addTheMuon(new TheMuon(cardId, ngayMuon, ngayTra, bookId, sinhVien));
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao ma so the sach ban muon xoa: ");
                    String id = sc.nextLine();
                    quanLySachMuon.deleteTheMuonById(id);
                    break;
                }
                case "3": {
                    quanLySachMuon.showInfoTheMuon();
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