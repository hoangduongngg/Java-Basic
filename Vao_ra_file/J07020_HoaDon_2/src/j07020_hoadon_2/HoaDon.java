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
public class HoaDon {
    private String MaHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private Integer SoLuong, ThanhTien;

    public HoaDon(Integer stt, KhachHang khachHang, MatHang matHang, Integer SoLuong) {
        this.MaHD = "HD" + String.format("%03d", stt);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.SoLuong = SoLuong;
        this.ThanhTien = SoLuong*matHang.getGiaBan();
    }
    
    @Override
    public String toString() {
        return MaHD + " " + khachHang + " " + matHang + " " + SoLuong + " " +ThanhTien  ;
    }
    
    
}
