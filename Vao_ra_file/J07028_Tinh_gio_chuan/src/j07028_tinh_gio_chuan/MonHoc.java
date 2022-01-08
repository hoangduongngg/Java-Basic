package j07028_tinh_gio_chuan;

public class MonHoc {
    private String MaMH;

    public MonHoc (String s) {
        this.MaMH = xuly_MaMH(s);
    }
    private String xuly_MaMH (String s) {
        int i = s.indexOf(" ");
        return s.substring(0, i);
    }

    public String getMaMH() {
        return MaMH;
    }
}
