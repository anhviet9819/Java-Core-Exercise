package Bai10;

public class VanBan {
    private String str;

    public VanBan() {
    }
    public VanBan(String str) {
        this.str = str;
    }
    public int demSoTu(String str){
        if (str == null || str.isEmpty()) { return 0; }
        String[] words = str.split("\\s+");
        return words.length;
    }
    public long demKiTu(String str){
        //common solution
//        long count = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'A') count++;
//        }

        // Java 8
        long count = str.chars().filter(ch -> ch == 'a' || ch == 'A').count();
//        long count = str.codePoints().filter(ch -> ch == 'a' || ch == 'A').count();
        return count;
    }

    public String chuanHoaXauKiTu(String str){
        str = str.trim();
        //Cach 1
//        while (str.indexOf("  ") != -1){
//            str = str.replaceAll("  "," ");
//        }
        //Cach 2: regex
        str = str.replaceAll("\\s+", " ");
        return str;
    }
}
