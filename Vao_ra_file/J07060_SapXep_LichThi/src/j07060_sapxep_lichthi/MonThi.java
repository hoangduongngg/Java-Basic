/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07060_sapxep_lichthi;

/**
 *
 * @author hoangduongngg
 */
public class MonThi {
    private String MaMH, TenMH, HinhThucThi;
    public MonThi() {
    }
    
    public MonThi(String MaMH, String TenMH, String HinhThucThi) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.HinhThucThi = HinhThucThi;
    }

    public String getMaMH() {
        return MaMH;
    }

    @Override
    public String toString() {
        return  TenMH  ;
    }
    
    
}
