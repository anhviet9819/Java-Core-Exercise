package Bai1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while (true) {
            System.out.println("Chuong trinh quan ly can bo: ");
            System.out.println("Enter 1: Them moi can bo");
            System.out.println("Enter 2: Tim kiem can bo theo ten");
            System.out.println("Enter 3: Hien thi danh sach can bo");
            System.out.println("Enter 4: Thoat");
            System.out.print("Nhap lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.println("Nhap 1 de them cong nhan: ");
                    System.out.println("Nhap 2 de them ky su: ");
                    System.out.println("Nhap 3 de them nhan vien: ");
                    System.out.print("Nhap lua chon: ");
                    String type = sc.nextLine();
                    switch (type) {
                        case "1": {
                            System.out.print("Nhap vao ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap vao tuoi:");
                            String age = sc.nextLine();
                            Integer age1;
                            try {
                                age1 = Integer.parseInt(age);
                            } catch (Exception e) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
                            if (age1 < 0) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
//                            sc.nextLine();
                            String gender;
                            do {
                                System.out.print("Nhap vao gioi tinh(nam, nu, khac): ");
                                gender = sc.nextLine();
                                if (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac")) {
                                    System.out.println("Gioi tinh ban nhap vao khong hop le! Hay nhap lai.");
                                }
                            } while (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac"));

                            System.out.print("Nhap vao dia chi: ");
                            String address = sc.nextLine();
                            Integer level;
                            do {
                                System.out.print("Nhap vao level(tu 1 den 10): ");
                                level = sc.nextInt();
                                if (level > 10 || level < 1) {
                                    System.out.println("Level phai trong khoang 1 den 10!");
                                }
                            } while (level > 10 || level < 1);
                            CongNhan congNhan = new CongNhan(name, age1, gender, address, level);
                            quanLyCanBo.themCanBo(congNhan);
                            System.out.println(congNhan.toString());
//                            sc.nextLine();
                            break;

                        }
                        case "2": {
                            System.out.print("Nhap vao ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap vao tuoi:");
                            String age = sc.nextLine();
                            Integer age1;
                            try {
                                age1 = Integer.parseInt(age);
                            } catch (Exception e) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
                            if (age1 < 0) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
//                            sc.nextLine();
                            String gender;
                            do {
                                System.out.print("Nhap vao gioi tinh(nam, nu, khac): ");
                                gender = sc.nextLine();
                                if (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac")) {
                                    System.out.println("Gioi tinh ban nhap vao khong hop le! Hay nhap lai.");
                                }
                            } while (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac"));

                            System.out.print("Nhap vao dia chi: ");
                            String address = sc.nextLine();
                            System.out.print("Nhap vao nganh dao tao: ");
                            String major = sc.nextLine();
                            KySu kySu = new KySu(name, age1, gender, address, major);
                            quanLyCanBo.themCanBo(kySu);
                            System.out.println(kySu.toString());
//                            sc.nextLine();
                            break;

                        }
                        case "3": {
                            System.out.print("Nhap vao ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap vao tuoi:");
                            String age = sc.nextLine();
                            Integer age1;
                            try {
                                age1 = Integer.parseInt(age);
                            } catch (Exception e) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
                            if (age1 < 0) {
                                System.out.println("Tuoi ban nhap vao khong hop le!");
                                continue;
                            }
//                            sc.nextLine();
                            String gender;
                            do {
                                System.out.print("Nhap vao gioi tinh(nam, nu, khac): ");
                                gender = sc.nextLine();
                                if (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac")) {
                                    System.out.println("Gioi tinh ban nhap vao khong hop le! Hay nhap lai.");
                                }
                            } while (!gender.equals("nam") & !gender.equals("nu") & !gender.equals("khac"));

                            System.out.print("Nhap vao dia chi: ");
                            String address = sc.nextLine();
                            System.out.print("Nhap vao cong viec: ");
                            String job = sc.nextLine();
                            NhanVien nhanVien = new NhanVien(name, age1, gender, address, job);
                            quanLyCanBo.themCanBo(nhanVien);
                            System.out.println(nhanVien.toString());
//                            sc.nextLine();
                            break;
                        }

                        default:
                            System.out.println("Hay nhap so hop le!");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao ten can bo: ");
                    String name = sc.nextLine();
                    List<CanBo> canBoList = quanLyCanBo.timCanBoTheoTen(name);
                    canBoList.forEach(canBo -> System.out.println(canBo));
                    break;
                }
                case "3": {
                    quanLyCanBo.hienThiDanhSach();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Hay nhap vao so hop le");
                    continue;
            }

        }
    }
}