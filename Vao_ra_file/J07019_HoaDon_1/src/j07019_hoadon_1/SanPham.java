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
public class SanPham {
    private String MaSP , TenSP;
    private Double GiaLoai1, GiaLoai2;

    public SanPham(String MaSP, String TenSP, String GiaLoai1, String GiaLoai2) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaLoai1 = Double.parseDouble(GiaLoai1);
        this.GiaLoai2 = Double.parseDouble(GiaLoai2);
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public Double getGiaLoai1() {
        return GiaLoai1;
    }

    public Double getGiaLoai2() {
        return GiaLoai2;
    }
    
    
    
}
