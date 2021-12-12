/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_lichthi;

/**
 *
 * @author hoangduongngg
 */
public class LichThi implements Comparable<LichThi>{
    private String MaCaThi, NgayThi , GioThi, PhongThi , TenMonThi , Nhom , SoSinhVien ;

    public LichThi(String MaCaThi, String NgayThi, String GioThi, String PhongThi, String TenMonThi, String Nhom, String SoSinhVien) {
        this.MaCaThi = MaCaThi;
        this.NgayThi = NgayThi;
        this.GioThi = GioThi;
        this.PhongThi = PhongThi;
        this.TenMonThi = TenMonThi;
        this.Nhom = Nhom;
        this.SoSinhVien = SoSinhVien;
    }
    
    private String DoiKieu (String NgayThi) {
//        Doi sang kieu yyyy/mm/dd
          String[] t = NgayThi.split("/");
          return t[2]+"/"+t[1]+"/"+t[0];
    }

    @Override
    public String toString() {
        return NgayThi + " " + GioThi + " " + PhongThi + " " + TenMonThi + " " + Nhom + " " + SoSinhVien ;
    }

    @Override
    public int compareTo(LichThi o) {
        if (this.NgayThi.compareTo(o.NgayThi)!=0) {
            return DoiKieu(this.NgayThi).compareTo(DoiKieu(o.NgayThi));
        }
        if (this.GioThi.compareTo(o.GioThi)!=0) {
            return this.GioThi.compareTo(o.GioThi);
        }
        return this.MaCaThi.compareTo(o.MaCaThi);
    }
}
