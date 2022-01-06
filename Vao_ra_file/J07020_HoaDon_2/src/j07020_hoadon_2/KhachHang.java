/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07020_hoadon_2;

/**
 *
 * @author hoangduongngg
 */
public class KhachHang {
    private String MaKH, TenKH, GioiTinh, DOB, DiaChi;
    public KhachHang() {
    }
    public KhachHang(Integer stt, String TenKH, String GioiTinh, String DOB, String DiaChi) {
        this.MaKH = "KH" + String.format("%03d", stt);
        this.TenKH = TenKH;
        this.GioiTinh = GioiTinh;
        this.DOB = DOB;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    @Override
    public String toString() {
        return  TenKH + " " + DiaChi;
    }
    
    
}
