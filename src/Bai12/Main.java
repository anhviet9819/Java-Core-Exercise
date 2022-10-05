package Bai12;

import Bai9.BienLai;
import Bai9.HoGiaDinh;
import Bai9.QuanLyBienLai;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLPTGT qlptgt = new QLPTGT();
        while (true) {
            System.out.println("Chuong trinh quan ly phuong tien giao thong");
            System.out.println("Enter 1: Them PTGT");
            System.out.println("Enter 2: Xoa PTGT");
            System.out.println("Enter 3: Tim PTGT theo hang san xuat");
            System.out.println("Enter 4: Tim PTGT theo mau xe");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    String type = "";
                    do {
                        System.out.println("Chon loai PTGT muon them vao");
                        System.out.println("Nhap 1 de them o to");
                        System.out.println("Nhap 2 de them xe may");
                        System.out.println("Nhap 3 de them xe tai");
                        System.out.printf("Nhap vao lua chon: ");
                        type = sc.nextLine();
                        if (!type.equals("1") & !type.equals("2") & !type.equals("3")) {
                            System.out.println("So ban nhap vao khong hop le. Hay nhap lai!");
                        }
                    } while (!type.equals("1") & !type.equals("2") & !type.equals("3"));
                    System.out.println("Nhap vao thong tin PTGT: ");
                    System.out.print("Nhap vao id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap vao hang san xuat: ");
                    String hangSanXuat = sc.nextLine();
                    System.out.print("Nhap vao nam san xuat: ");
                    Integer namSanXuat = sc.nextInt();
                    System.out.print("Nhap vao gia ban(don vi trieu VND): ");
                    Double giaBan = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap vao mau xe: ");
                    String mauXe = sc.nextLine();
                    switch (type) {
                        case "1": {
                            System.out.print("Nhap vao so cho ngoi: ");
                            Integer soChoNgoi = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap vao kieu dong co: ");
                            String dongCo = sc.nextLine();
                            Oto oto = new Oto(id, hangSanXuat, namSanXuat, giaBan, mauXe, soChoNgoi, dongCo);
                            qlptgt.themPTGT(oto);
                            System.out.println(oto);
                            break;
                        }
                        case "2": {
                            System.out.print("Nhap vao cong suat: ");
                            Double congSuat = sc.nextDouble();
                            XeMay xeMay = new XeMay(id, hangSanXuat, namSanXuat, giaBan, mauXe, congSuat);
                            qlptgt.themPTGT(xeMay);
                            System.out.println(xeMay);
                            sc.nextLine();
                            break;
                        }
                        case "3": {
                            System.out.print("Nhap vao trong tai: ");
                            Double trongTai = sc.nextDouble();
                            XeTai xeTai = new XeTai(id, hangSanXuat, namSanXuat, giaBan, mauXe, trongTai);
                            qlptgt.themPTGT(xeTai);
                            System.out.println(xeTai);
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao id PTGT ban muon xoa: ");
                    String id = sc.nextLine();
                    qlptgt.xoaPTGT(id);
                    break;
                }
                case "3": {
                    System.out.print("Nhap vao hang san xuat xe ban muon tim kiem: ");
                    String hangSanXuat = sc.nextLine();
                    List<Xe> xeList = qlptgt.timPTGTByHangSanXuat(hangSanXuat);
                    if(xeList != null){
                        xeList.forEach(System.out::println);
                    }
                    else System.out.println("Khong tim thay xe voi hang san xuat ban da nhap!");
                    break;
                }
                case "4": {
                    System.out.print("Nhap vao mau xe ban muon tim kiem: ");
                    String mauXe = sc.nextLine();
                    List<Xe> xeList = qlptgt.timPTGTByMauXe(mauXe);
                    if(xeList != null){
                        xeList.forEach(System.out::println);
                    }
                    else System.out.println("Khong tim thay xe voi mau xe ban da nhap!");
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