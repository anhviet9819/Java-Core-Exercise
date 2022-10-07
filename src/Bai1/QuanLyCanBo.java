package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {
    private List<CanBo> canBoList;

    public QuanLyCanBo() {
        this.canBoList = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo){
        this.canBoList.add(canBo);
    }

    public List<CanBo> timCanBoTheoTen(String name){
        return this.canBoList.stream().filter(canBo -> name.toLowerCase().contains(canBo.getName().toLowerCase())).collect(Collectors.toList());
    }

    public void hienThiDanhSach(){
        this.canBoList.forEach(canBo -> System.out.println(canBo.toString()));
    }
}
