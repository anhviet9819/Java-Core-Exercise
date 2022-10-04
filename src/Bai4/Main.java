package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap vao so ho gia dinh ban muon them: ");
        Scanner sc = new Scanner(System.in);
        Integer n;
        KhuPho khuPho = new KhuPho();
        List<HoGiaDinh> hoGiaDinhList = new ArrayList<>();
        try{
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Ban nhap vao so ho gia dinh khong hop le!");
            return;
        }
        for (int i = 1; i <= n; i++){
            System.out.println("Nhap vao so nha cua ho gia dinh " + i + " :");
            String soNha = sc.nextLine();
            System.out.printf("Nhap vao so thanh vien trong gia dinh:");
            Integer soThanhVien;
            try{
                soThanhVien = sc.nextInt();
            }catch (Exception e){
                System.out.println("So thanh vien ban nhap vao khong hop le!");
                return;
            }
            List<Nguoi> listThanhVien = new ArrayList<>();
            for (int j = 1; j <= soThanhVien; j++){
                Integer count = 0;
                System.out.println("Nhap vao thong tin thanh vien " + j);
                System.out.printf("Nhap vao ten: ");
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
                System.out.printf("Nhap vao nghe nghiep: ");
                String job = sc.nextLine();
                System.out.printf("Nhap vao so CMND: ");
                String id = sc.nextLine();
                for (Nguoi nguoi : listThanhVien){
                    if(nguoi.getId() == id){
                        count++;
                        break;
                    }
                }
                if(count == 0) listThanhVien.add(new Nguoi(name, age1, job, id));
            }
            HoGiaDinh hoGiaDinh = new HoGiaDinh(listThanhVien, soNha);
            hoGiaDinhList.add(hoGiaDinh);
        }
        khuPho.setHoGiaDinhSet(hoGiaDinhList);
    }
}