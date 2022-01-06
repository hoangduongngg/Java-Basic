/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05052_tracuu_donhang;

/**
 *
 * @author hoangduongngg
 */
public class DonHang {
    private String  TenDH, MaDH , STT;
    private Integer GiamGia , ThanhTien ;

    public DonHang(String TenDH, String MaDH, String DonGia, String SoLuong) {
        this.TenDH = TenDH;
        this.MaDH = MaDH;
        this.STT = xuly_STT(MaDH);
        this.GiamGia = xuly_GiamGia(MaDH, DonGia, SoLuong);
        this.ThanhTien = xuly_ThanhTien(GiamGia, DonGia, SoLuong);
    }
    
    private String xuly_STT (String MaDH) {
        return MaDH.substring(1,4);
    }
    private Integer xuly_GiamGia (String MaDH, String DonGia, String SoLuong) {
        int LoaiMa = Integer.parseInt(MaDH.charAt(4)+"");
        Integer TongTien = Integer.parseInt(DonGia) * Integer.parseInt(SoLuong);
        if (LoaiMa==1) {
            return TongTien/2;
        }
        return TongTien*3/10;
    }
    private Integer xuly_ThanhTien (Integer GiamGia, String DonGia, String SoLuong) {
        Integer TongTien = Integer.parseInt(DonGia) * Integer.parseInt(SoLuong);
        return TongTien - GiamGia;
    }
    

    @Override
    public String toString() {
        return TenDH + " " + MaDH + " " + STT + " " + GiamGia + " " + ThanhTien ;
    }
    
    
}
