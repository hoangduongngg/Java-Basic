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
public class CaThi {
    private String MaCT, NgayThi, GioThi, PhongThi;
    public CaThi() {
    }
    
    public CaThi(Integer stt, String NgayThi, String GioThi, String PhongThi) {
        this.MaCT = "C" + String.format("%03d", stt);
        this.NgayThi = NgayThi;
        this.GioThi = GioThi;
        this.PhongThi = PhongThi;
    }

    public String getMaCT() {
        return MaCT;
    }

    public String getNgayThi() {
        return NgayThi;
    }

    public String getGioThi() {
        return GioThi;
    }

    @Override
    public String toString() {
        return NgayThi + " " + GioThi + " " + PhongThi  ;
    }
    
    
}
