/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05017_hoadon_tiennuoc;

/**
 *
 * @author hoangduongngg
 */
public class HoaDon implements Comparable<HoaDon>{

    private String MaKH , TenKH ;
    private Double TongSoTien;

    public HoaDon(Integer stt, String TenKH, String ChiSoMoi, String ChiSoCu) {
        this.MaKH = "KH" + String.format("%03d", stt);
        this.TenKH = TenKH;
        this.TongSoTien = xuly_TongSoTien(ChiSoMoi, ChiSoCu);
    }
        
    private Double xuly_TongSoTien (String ChiSoMoi, String ChiSoCu) {
        Double LuongNuoc = Double.parseDouble(ChiSoCu) - Double.parseDouble(ChiSoMoi);
        Double res;
        if (LuongNuoc<=50) res = (LuongNuoc*100)*102/100 ;
        else if (LuongNuoc<=100) res = (50*100 + (LuongNuoc-50)*150) *103/100;
        else res = (50*100 + 50*150 + (LuongNuoc-100)*200) *105/100;
        
        return res;
    }

    @Override
    public String toString() {
        return  MaKH + " " + TenKH + " " + String.format("%.0f",TongSoTien) ;
    }
    
    
    @Override
    public int compareTo(HoaDon o) {
        return (int) (o.TongSoTien-this.TongSoTien);
    }
    
}
