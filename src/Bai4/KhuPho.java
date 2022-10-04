package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KhuPho {
    private List<HoGiaDinh> hoGiaDinhList;

    public KhuPho() {
        this.hoGiaDinhList = new ArrayList();
    }

    public List<HoGiaDinh> getHoGiaDinhSet() {
        return hoGiaDinhList;
    }

    public void setHoGiaDinhSet(List<HoGiaDinh> hoGiaDinhSet) {
        this.hoGiaDinhList = hoGiaDinhSet;
    }

    public void themHoGiaDinh(HoGiaDinh hoGiaDinh){
        this.hoGiaDinhList.add(hoGiaDinh);
    }
}
