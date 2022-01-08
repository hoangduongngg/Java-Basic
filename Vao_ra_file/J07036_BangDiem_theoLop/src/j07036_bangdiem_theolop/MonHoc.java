/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07036_bangdiem_theolop;

/**
 *
 * @author hoangduongngg
 */
public class MonHoc {
    private String MaMH , TenMH, SoTinChi;
    
    public MonHoc() {
    }

    public MonHoc(String MaMH, String TenMH, String SoTinChi) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTinChi = SoTinChi;
    }

    public String getMaMH() {
        return MaMH;
    }

    @Override
    public String toString() {
        return  MaMH + " " + TenMH ;
    }
    
    
}
