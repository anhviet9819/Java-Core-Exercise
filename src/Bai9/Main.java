package Bai9;

import Bai8.QuanLySachMuon;
import Bai8.SinhVien;
import Bai8.TheMuon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyBienLai quanLyBienLai = new QuanLyBienLai();
        while (true) {
            System.out.println("Chuong trinh quan ly thong tin su dung dien");
            System.out.println("Enter 1: Them bien lai");
            System.out.println("Enter 2: Xoa bien lai");
            System.out.println("Enter 3: Sua bien lai");
            System.out.println("Enter 4: Hien thi danh sach bien lai");
            System.out.println("Enter 5: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.println("Nhap vao thong tin bien lai");
                    System.out.print("Nhap vao ho ten chu ho: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap vao so nha chu ho: ");
                    String address = sc.nextLine();
                    System.out.print("Nhap vao ma so cong to dien: ");
                    String maSoCongToDien = sc.nextLine();
                    boolean temp = true;
                    int chiSoDienCu = 0;
                    do {
                        try {
                            System.out.print("Nhap vao chi so dien cu: ");
                            chiSoDienCu = sc.nextInt();
                            temp = true;
                            if (chiSoDienCu < 0) {
                                System.out.println("Chi so dien khong hop le, hay kiem tra lai!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Chi so dien khong hop le!");
                            temp = false;
                            break;
                        }
                    } while (chiSoDienCu < 0);
                    int chiSoDienMoi = 0;
                    do {
                        try {
                            System.out.print("Nhap vao chi so dien moi: ");
                            chiSoDienMoi = sc.nextInt();
                            temp = true;
                            if (chiSoDienMoi < 0 || chiSoDienMoi < chiSoDienCu) {
                                System.out.println("Chi so dien khong hop le, hay kiem tra lai!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Chi so dien khong hop le!");
                            temp = false;
                            break;
                        }
                    } while (chiSoDienMoi < 0 || chiSoDienMoi < chiSoDienCu);
                    if(temp == true){
                        HoGiaDinh hoGiaDinh = new HoGiaDinh(name, address, maSoCongToDien);
                        quanLyBienLai.themBienLai(new BienLai(hoGiaDinh, chiSoDienCu, chiSoDienMoi));
                    }
                    else {
                        System.out.println("Thong tin ban nhap khong hop le!");
                    }
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Nhap vao ma so cong to dien ban muon xoa bien lai: ");
                    String id = sc.nextLine();
                    quanLyBienLai.xoaBienLai(id);
                    break;
                }
                case "3": {
                    System.out.print("Nhap vao ma so cong to dien ban muon sua bien lai: ");
                    String maSoCongToDien = sc.nextLine();
                    BienLai bienLaiChinhSua = quanLyBienLai.timBienLai(maSoCongToDien);
                    if(bienLaiChinhSua != null){
                        System.out.println("Thong tin bien lai muon chinh sua:");
                        System.out.println(bienLaiChinhSua);
                        System.out.print("Nhap vao so dien cu muon chinh sua: ");
                        Integer chiSoDienCu = sc.nextInt();
                        System.out.print("Nhap vao so dien moi muon chinh sua: ");
                        Integer chiSoDienMoi = sc.nextInt();
                        quanLyBienLai.suaBienLai(maSoCongToDien, new BienLai(bienLaiChinhSua.getHoGiaDinh(), chiSoDienCu, chiSoDienMoi));
                    }
                    else {
                        System.out.println("Khong tim thay bien lai voi ma so cong to dien tren!");
                    }
                    sc.nextLine();
                    break;
                }
                case "4": {
                    quanLyBienLai.showInfoBienLai();
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