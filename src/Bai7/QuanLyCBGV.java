package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCBGV {
    List<CBGV> cbgvList;

    public QuanLyCBGV(){
        this.cbgvList = new ArrayList<>();
    }

    public void addCBGV(CBGV cbgv){
        CBGV cbgvAdd = this.cbgvList.stream().filter(cbgv1 -> cbgv1.getId().equals(cbgv.getId())).findAny().orElse(null);
        if(cbgvAdd != null){
            this.cbgvList.add(cbgv);
        }else{
            System.out.println("Ma so giao vien da ton tai. Hay kiem tra lai!");
        }
    }

    public void deleteCBGVById(String id){
        CBGV cbgvDelete = this.cbgvList.stream().filter(cbgv -> cbgv.getId().equals(id)).findAny().orElse(null);
        if(cbgvDelete != null){
            cbgvList.remove(cbgvDelete);
            System.out.println("Xoa thanh cong CBGV "+ id);
        }
        else{
            System.out.println("Khong co CBGV ban muon xoa!");
        }
    }

    public void showInfoCBGV(){
        if(this.cbgvList.size() != 0){
            System.out.println("Danh sach CBGV: ");
            this.cbgvList.forEach(c -> System.out.println(c));
        }
        else {
            System.out.println("CHua co CBGV nao!");
        }
    }
}
