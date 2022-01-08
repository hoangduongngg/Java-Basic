package j07028_tinh_gio_chuan;

public class GiangVien {
    private String MaGV, TenGV;

    public GiangVien() {
    }

    public GiangVien(String s) {
        this.MaGV = xuly_MaGV(s);
        this.TenGV = xuly_TenGV(s);
    }
    private String xuly_MaGV (String s) {
        int i = s.indexOf(" ");
        return s.substring(0, i);
    }
    private String xuly_TenGV (String s) {
        int i = s.indexOf(" ");
        return s.substring(i+1);
    }

    public String getMaGV() {
        return MaGV;
    }

    @Override
    public String toString() {
        return  TenGV  ;
    }
}
