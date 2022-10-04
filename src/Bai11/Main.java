package Bai11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chuong trinh so phuc");
            System.out.println("Enter 1: Nhap vao so phuc");
            System.out.println("Enter 2: Cong 2 so phuc");
            System.out.println("Enter 3: Nhan 2 so phuc");
            System.out.println("Enter 4: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.print("Nhap vao phan thuc: ");
                    Double phanThuc = sc.nextDouble();
                    System.out.print("Nhap vao phan ao: ");
                    Double phanAo = sc.nextDouble();
                    SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
                    System.out.println("So phuc ban vua nhap la: " + soPhuc.hienThiSoPhuc());
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Nhap vao so thuc 1");
                    System.out.print("Nhap vao phan thuc:");
                    Double phanThuc1 = sc.nextDouble();
                    System.out.print("Nhap vao phan ao: ");
                    Double phanAo1 = sc.nextDouble();
                    SoPhuc soPhuc1 = new SoPhuc(phanThuc1, phanAo1);

                    System.out.println("Nhap vao so thuc 2");
                    System.out.print("Nhap vao phan thuc:");
                    Double phanThuc2 = sc.nextDouble();
                    System.out.print("Nhap vao phan ao: ");
                    Double phanAo2 = sc.nextDouble();
                    SoPhuc soPhuc2 = new SoPhuc(phanThuc2, phanAo2);

                    Double phanThuc = phanThuc1 + phanThuc2;
                    Double phanAo = phanAo1 + phanAo2;
                    SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
                    System.out.println("(" + soPhuc1.hienThiSoPhuc() + ")" + " + (" + soPhuc2.hienThiSoPhuc() + ") = " + soPhuc.hienThiSoPhuc());
                    break;
                }
                case "3": {
                    System.out.println("Nhap vao so thuc 1");
                    System.out.print("Nhap vao phan thuc:");
                    Double phanThuc1 = sc.nextDouble();
                    System.out.print("Nhap vao phan ao: ");
                    Double phanAo1 = sc.nextDouble();
                    SoPhuc soPhuc1 = new SoPhuc(phanThuc1, phanAo1);

                    System.out.println("Nhap vao so thuc 2");
                    System.out.print("Nhap vao phan thuc:");
                    Double phanThuc2 = sc.nextDouble();
                    System.out.print("Nhap vao phan ao: ");
                    Double phanAo2 = sc.nextDouble();

                    SoPhuc soPhuc2 = new SoPhuc(phanThuc2, phanAo2);
                    Double phanThuc = phanThuc1 * phanThuc2;
                    Double phanAo = phanAo1 * phanAo2;
                    SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
                    System.out.println("(" + soPhuc1.hienThiSoPhuc() + ")" + " * (" + soPhuc2.hienThiSoPhuc() + ") = " + soPhuc.hienThiSoPhuc());
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