package j07028_tinh_gio_chuan;

public class GioChuan {
    private GiangVien giangVien;
    private String MaGV;
    private Double GioChuan;

    public GioChuan(GiangVien giangVien, String GioChuan) {
        this.giangVien = giangVien;
        this.MaGV = giangVien.getMaGV();
        this.GioChuan = Double.parseDouble(GioChuan);
    }
    
    public String getMaGV() {
        return MaGV;
    }

    public Double getGioChuan() {
        return GioChuan;
    }

    public void setGioChuan(Double GioChuan) {
        this.GioChuan = GioChuan;
    }
    

    @Override
    public String toString() {
        return giangVien  + " " + String.format("%.2f", GioChuan) ;
    }
}
