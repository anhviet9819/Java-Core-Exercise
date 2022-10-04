package Bai11;

public class SoPhuc {
    private Double phanThuc;
    private Double phanAo;

    public SoPhuc(Double phanThuc, Double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public Double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(Double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public Double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(Double phanAo) {
        this.phanAo = phanAo;
    }
    public String hienThiSoPhuc(){
        String strPhanThuc = String.valueOf(this.phanThuc);
        for(int i = 0; i < strPhanThuc.length(); i++){
            if(strPhanThuc.charAt(i) == '.'){
                if(strPhanThuc.charAt(i+1) == '0') strPhanThuc = strPhanThuc.substring(0, strPhanThuc.length() - 2);
            }
        }
        String strPhanAo = String.valueOf(this.phanAo);
        for(int i = 0; i < strPhanAo.length(); i++){
            if(strPhanAo.charAt(i) == '.'){
                if(strPhanAo.charAt(i+1) == '0') strPhanAo = strPhanAo.substring(0, strPhanAo.length() - 2);
            }
        }
        return strPhanThuc + " + " + strPhanAo + "i";
    }
}
