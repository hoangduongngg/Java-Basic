/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07019_hoadon_1;

/**
 *
 * @author hoangduongngg
 */
public class HoaDon {
    private String MaHoaDon, TenSP ;
    private Double  ThanhTien, TienGiamGia, TienPhaiTra;
    public HoaDon(Integer stt, SanPham sp, String MaHoaDon, String SoLuong) {
        this.MaHoaDon = xuly_MaHoaDon(stt, MaHoaDon);
        this.TenSP = sp.getTenSP();
        this.ThanhTien = xuly_ThanhTien(sp, SoLuong, MaHoaDon);
        this.TienGiamGia = xuly_TienGiamGia(ThanhTien, SoLuong);
        this.TienPhaiTra = ThanhTien-TienGiamGia;
    }
    
    private String xuly_MaHoaDon (Integer stt, String MaHoaDon) {
        return MaHoaDon +"-" + String.format("%03d", stt);
    }
    private Double xuly_ThanhTien (SanPham sp, String SoLuong, String MaHoaDon) {
        Double  GiaSP, LoaiSP, SoLuongSP;
        LoaiSP = Double.parseDouble(MaHoaDon.charAt(2)+"");
        SoLuongSP = Double.parseDouble(SoLuong);
        if (LoaiSP==1) GiaSP = sp.getGiaLoai1();
        else GiaSP = sp.getGiaLoai2();
        return GiaSP*SoLuongSP;
    }
    
    private Double xuly_TienGiamGia (Double ThanhTien, String SoLuong ) {
        Double SoLuongSP = Double.parseDouble(SoLuong);
        
        if (SoLuongSP>=150) return ThanhTien*50/100;
        else if (SoLuongSP>=100) return  ThanhTien*30/100;
        else if (SoLuongSP>=50) return  ThanhTien*15/100;
        return 0.0;
    }
    
    

    @Override
    public String toString() {
        return MaHoaDon + " " + TenSP + " " + String.format("%.0f", TienGiamGia) + " " + String.format("%.0f",TienPhaiTra ) ;
    }
}
