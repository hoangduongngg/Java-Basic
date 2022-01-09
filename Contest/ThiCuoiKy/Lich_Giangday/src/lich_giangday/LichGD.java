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
public class LichGD implements Comparable<LichGD>{
    private String MaNhom, MaMH, TenGV, PhongHoc;
    private Integer Thu , Kip;

    public LichGD(Integer stt, String MaMH, String Thu, String Kip, String TenGV, String PhongHoc) {
        this.MaNhom = "HP" + String.format("%03d", stt);
        this.MaMH = MaMH;
        this.TenGV = TenGV;
        this.PhongHoc = PhongHoc;
        this.Thu = Integer.parseInt(Thu);
        this.Kip = Integer.parseInt(Kip);
    }

    public String getMaMH() {
        return MaMH;
    }

    @Override
    public String toString() {
        return  MaNhom + " "+ Thu + " " + Kip + " " + TenGV + " " + PhongHoc  ;
    }

    @Override
    public int compareTo(LichGD o) {
        int x = this.Thu - o.Thu;
        if (x!=0) return x;
        x = this.Kip - o.Kip;
        if (x!=0) return x;
        return this.TenGV.compareTo(o.TenGV);
    }
    
    
}
