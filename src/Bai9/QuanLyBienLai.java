package Bai9;

import Bai8.TheMuon;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBienLai {
    private List<BienLai> bienLaiList;

    public QuanLyBienLai() {
        this.bienLaiList = new ArrayList<>();
    }
    public void themBienLai(BienLai bienLai){
        BienLai bienLaiAdd = this.bienLaiList.stream().filter(bienLai1 -> bienLai1.getHoGiaDinh().getMaSoCongToDien().equals(bienLai.getHoGiaDinh().getMaSoCongToDien())).findAny().orElse(null);
        if(bienLaiAdd == null){
            this.bienLaiList.add(bienLai);
        }else{
            System.out.println("Ma so cong to dien ban them da ton tai. Hay kiem tra lai!");
        }
    }
    public void xoaBienLai(String maSoCongToDien){
        BienLai bienLaiDelete = this.bienLaiList.stream().filter(bienLai -> bienLai.getHoGiaDinh().getMaSoCongToDien().equals(maSoCongToDien)).findAny().orElse(null);
        if(bienLaiDelete != null){
            bienLaiList.remove(bienLaiDelete);
            System.out.println("Xoa thanh cong bien lai cua ho gia dinh co ma so cong to dien "+ bienLaiDelete.getHoGiaDinh().getMaSoCongToDien());
        }
        else{
            System.out.println("Khong co bien lai ban muon xoa!");
        }
    }

    public BienLai timBienLai(String maSoCongToDien){
        BienLai bienLaiTimKiem = this.bienLaiList.stream().filter(bienLai -> bienLai.getHoGiaDinh().getMaSoCongToDien().equals(maSoCongToDien)).findAny().orElse(null);
        if(bienLaiTimKiem != null){
            return bienLaiTimKiem;
        }
        else{
            return null;
        }
    }

    public void suaBienLai(String maSoCongToDien, BienLai bienLaiRequest){
        BienLai bienLaiUpdate = this.bienLaiList.stream().filter(bienLai -> bienLai.getHoGiaDinh().getMaSoCongToDien().equals(maSoCongToDien)).findAny().orElse(null);
        if(bienLaiUpdate != null){
            int indexBienLaiUpdate = bienLaiList.indexOf(bienLaiUpdate);
            this.bienLaiList.set(indexBienLaiUpdate, bienLaiRequest);
            System.out.println("Chinh sua bien lai thanh cong!");
        }
        else{
            System.out.println("Khong co bien lai ban muon chinh sua!");
        }
    }
    public void showInfoBienLai(){
        if(this.bienLaiList.size() != 0){
            System.out.println("Danh sach bien lai: ");
            this.bienLaiList.forEach(c -> System.out.println(c));
        }
        else {
            System.out.println("Chua co bien lai nao!");
        }
    }
}
