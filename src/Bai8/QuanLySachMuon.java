package Bai8;

import Bai7.CBGV;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachMuon {
    List<TheMuon> theMuonList;
    public QuanLySachMuon(){
        this.theMuonList = new ArrayList<>();
    }

    public void addTheMuon(TheMuon theMuon){
        TheMuon theMuonAdd = this.theMuonList.stream().filter(cbgv1 -> cbgv1.getId().equals(theMuon.getId())).findAny().orElse(null);
        if(theMuonAdd == null){
            this.theMuonList.add(theMuon);
        }else{
            System.out.println("Ma so the muon da ton tai. Hay kiem tra lai!");
        }
    }

    public void deleteTheMuonById(String id){
        TheMuon theMuonDelete = this.theMuonList.stream().filter(theMuon -> theMuon.getId().equals(id)).findAny().orElse(null);
        if(theMuonDelete != null){
            theMuonList.remove(theMuonDelete);
            System.out.println("Xoa thanh cong the muon "+ id);
        }
        else{
            System.out.println("Khong co the muon ban muon xoa!");
        }
    }
    public void showInfoTheMuon(){
        if(this.theMuonList.size() != 0){
            System.out.println("Danh sach the muon: ");
            this.theMuonList.forEach(c -> System.out.println(c));
        }
        else {
            System.out.println("Chua co the muon nao!");
        }
    }
}
