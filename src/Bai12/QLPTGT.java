package Bai12;

import Bai9.BienLai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLPTGT {
    private List<Xe> xeList;
    public QLPTGT(){
        this.xeList = new ArrayList<>();
    }
    public void themPTGT(Xe xe){
        Xe xeAdd = xeList.stream().filter(xe1 -> xe1.getId().equals(xe.getId())).findAny().orElse(null);
        if(xeAdd == null){
            this.xeList.add(xe);
            System.out.println("Them PTGT thanh cong!");
        }else{
            System.out.println("ID PTGT da ton tai. Hay kiem tra lai!");
        }
    }
    public void xoaPTGT(String id){
        Xe xeDelete = this.xeList.stream().filter(xe -> xe.getId().equals(id)).findAny().orElse(null);
        if(xeDelete != null){
            xeList.remove(xeDelete);
            System.out.println("Xoa thanh cong PTGT co ID "+ xeDelete.getId());
        }
        else{
            System.out.println("Khong co PTGT ban muon xoa!");
        }
    }

    public List<Xe> timPTGTByHangSanXuat(String hangSanXuat){
        List<Xe> xeList1 = this.xeList.stream().filter(xe -> xe.getHangSanXuat().equals(hangSanXuat)).collect(Collectors.toList());
        if(xeList1.size() != 0){
            return xeList1;
        }
        else{
            return null;
        }
    }

    public List<Xe> timPTGTByMauXe(String mauXe){
        List<Xe> xeList1 = this.xeList.stream().filter(xe -> xe.getMauXe().equals(mauXe)).collect(Collectors.toList());
        if(xeList1.size() != 0){
            return xeList1;
        }
        else{
            return null;
        }
    }
}
