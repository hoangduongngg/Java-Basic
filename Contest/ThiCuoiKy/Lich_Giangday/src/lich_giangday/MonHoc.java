/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lich_giangday;

/**
 *
 * @author hoangduongngg
 */
public class MonHoc {
    private String MaMH, TenMH, SoTinChi;

    public MonHoc(String MaMH, String TenMH, String SoTinChi) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTinChi = SoTinChi;
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }
    
}
