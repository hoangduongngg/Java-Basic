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
public class MatHang {
    private String MaMH, TenMH, DonVi;
    private Integer GiaMua, GiaBan;
    public MatHang() {
    }
    public MatHang(Integer stt, String TenMH, String DonVi, String GiaMua, String GiaBan) {
        this.MaMH = "MH" + String.format("%03d", stt);
        this.TenMH = TenMH;
        this.DonVi = DonVi;
        this.GiaMua = Integer.parseInt(GiaMua);
        this.GiaBan = Integer.parseInt(GiaBan);

    }

    public String getMaMH() {
        return MaMH;
    }
    public Integer getGiaBan() {
        return GiaBan;
    }

    @Override
    public String toString() {
        return  TenMH + " " + DonVi + " " + GiaMua + " " + GiaBan;
    }
    
}
