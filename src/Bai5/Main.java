package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();
        while (true) {
            System.out.println("Chuong trinh quan ly khach san");
            System.out.println("Enter 1: Them khach thue phong");
            System.out.println("Enter 2: Xoa khach thue phong");
            System.out.println("Enter 3: Tinh tien phong");
            System.out.println("Enter 4: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.print("Nhap ten khach: ");
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
                    System.out.print("Nhap so CMND: ");
//                    sc.nextLine();
                    String id = sc.nextLine();

                    String luaChonLoaiPhong;
                    Phong phong;
                    do {
                        System.out.println("Nhap a de chon phong loai A");
                        System.out.println("Nhap b de chon phong loai B");
                        System.out.println("Nhap c de chon phong loai C");
                        luaChonLoaiPhong = sc.nextLine();
                        if (!luaChonLoaiPhong.equals("a") & !luaChonLoaiPhong.equals("b") & !luaChonLoaiPhong.equals("c")) {
                            System.out.println("Loai phong ban nhap vao khong hop le! Hay nhap lai.");
                        }
                    } while (!luaChonLoaiPhong.equals("a") & !luaChonLoaiPhong.equals("b") & !luaChonLoaiPhong.equals("c"));

                    if (luaChonLoaiPhong.equals("a")) {
                        phong = new PhongLoaiA();
                    } else if (luaChonLoaiPhong.equals("b")) {
                        phong = new PhongLoaiB();
                    } else {
                        phong = new PhongLoaiC();
                    }
                    System.out.print("Nhap so ngay thue phong: ");
                    Integer dayRent = sc.nextInt();
                    Khach khach = new Khach(name, age1, id, phong, dayRent);
                    khachSan.themKhach(khach);
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao so CMND cua khach muon xoa: ");
                    String id = sc.nextLine();
                    khachSan.deleteKhachById(id);
                    break;
                }
                case "3": {
                    System.out.print("Nhap vao so CMND cua khach muon tinh tien phong: ");
                    String id = sc.nextLine();
                    khachSan.tinhTienThuePhongById(id);
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