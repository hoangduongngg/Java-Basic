/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_cathi;

/**
 *
 * @author hoangduongngg
 */
public class CaThi implements Comparable<CaThi>{
    private String Ma, NgayThi, GioThi, PhongThi ;

    public CaThi(Integer stt, String NgayThi, String GioThi, String PhongThi) {
        this.Ma = xuly_stt(stt);
        this.NgayThi = NgayThi;
        this.GioThi = GioThi;
        this.PhongThi = PhongThi;
    }
    private String xuly_stt (Integer stt) {
        if (stt<10) return "C00"+stt;
        if (stt<100) return "C0" +stt;
        return "C" + stt;
    }
    private String DoiKieu (String NgayThi) {
//        Doi sang kieu yyyy/mm/dd
          String[] t = NgayThi.split("/");
          return t[2]+"/"+t[1]+"/"+t[0];
    }

    @Override
    public String toString() {
        return Ma + " " + NgayThi + " " + GioThi + " " + PhongThi ;
    }

    @Override
    public int compareTo(CaThi o) {
        if (this.NgayThi.compareTo(o.NgayThi)!=0) {
            return DoiKieu(this.NgayThi).compareTo(DoiKieu(o.NgayThi));
        }
        if (this.GioThi.compareTo(o.GioThi)!=0) {
            return this.GioThi.compareTo(o.GioThi);
        }
        return this.Ma.compareTo(o.Ma);
    }
    
    
}
