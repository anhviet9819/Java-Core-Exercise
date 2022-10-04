package Bai5;

import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Khach> khachList;
    public KhachSan(){
        this.khachList = new ArrayList<>();
    }

    public void themKhach(Khach khach){
        this.khachList.add(khach);
    }

    public void deleteKhachById(String id){
        Khach khach = this.khachList.stream().filter(khach1 -> khach1.getId().equals(id)).findAny().orElse(null);
        if(khach != null){
            this.khachList.remove(khach);
            System.out.println("Xoa khach thanh cong!");
        }
        else System.out.println("Khong tim thay khach theo so CMND tren!");
    }

    public void tinhTienThuePhongById(String id){
        Khach khach = this.khachList.stream().filter(khach1 -> khach1.getId().equals(id)).findAny().orElse(null);
        if(khach != null){
            Integer tienPhong = khach.getRoomRent().getPrice() * khach.getDayRent();
            System.out.println("Tien thue phong cua khach co so CMND " + khach.getId() + " la: " + tienPhong);
        }
        else System.out.println("Khong tim thay khach theo so CMND tren!");
    }
}
