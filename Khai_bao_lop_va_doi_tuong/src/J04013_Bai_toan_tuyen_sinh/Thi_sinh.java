package J04013_Bai_toan_tuyen_sinh;
/**
 *
 * @author hoangduongngg
 */
public class Thi_sinh {
    private String ID, name, trangthai;
    private double diem_uutien, diem_tong;
    
    public Thi_sinh() {      
    }
    public Thi_sinh(String ID, String name, double toan, double ly, double hoa) {
        this.ID = ID;
        this.name = name;
        this.diem_uutien = xuly_uutien (ID);
        this.diem_tong = toan*2 + ly + hoa;
        this.trangthai = xuly_trangthai (diem_tong + diem_uutien);
    }
    
    private double xuly_uutien (String ID) {
        String KV = "" + ID.charAt(2);
        if (KV.compareTo("1")==0) {
            return 0.5;
        }
        else if (KV.compareTo("2")==0) {
            return 1.0;
        }
        else {
            return 2.0;
        }
    }
    private String xuly_trangthai ( double diem_tong) {
        int diem_chuan = 24;
        if (diem_tong >= diem_chuan) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    
    private String xuly_so (double x) {   
        if (x == Math.round(x)) {
            return  String.valueOf(Math.round(x));
        }
        else {
            return String.valueOf(x);
        }
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + xuly_so(diem_uutien) + " " + xuly_so(diem_tong) + " " + trangthai ;
    }
}