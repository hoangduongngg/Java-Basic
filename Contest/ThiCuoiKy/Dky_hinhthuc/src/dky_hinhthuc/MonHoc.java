/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dky_hinhthuc;

/**
 *
 * @author hoangduongngg
 */
public class MonHoc implements Comparable<MonHoc>{
    private String MaMH, TenMH, SoTinChi, HinhThucLT, HinhThucTH;

    public MonHoc(String MaMH, String TenMH, String SoTinChi, String HinhThucLT, String HinhThucTH) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTinChi = SoTinChi;
        this.HinhThucLT = HinhThucLT;
        this.HinhThucTH = HinhThucTH;
    }

    @Override
    public String toString() {
        return  MaMH + " " + TenMH + " " + SoTinChi + " " + HinhThucLT + " " + HinhThucTH ;
    }

    public String getHinhThucTH() {
        return HinhThucTH;
    }
    
    @Override
    public int compareTo(MonHoc o) {
        return this.MaMH.compareTo(o.MaMH);
    }
    
    
}
