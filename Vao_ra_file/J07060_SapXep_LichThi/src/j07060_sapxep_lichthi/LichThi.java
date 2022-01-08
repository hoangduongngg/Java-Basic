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
public class LichThi implements Comparable<LichThi>{
    private CaThi caThi;
    private MonThi monThi;
    private String MaNhom;
    private Integer SoSinhVien ;

    public LichThi(CaThi caThi, MonThi monThi, String MaNhom, String SoSinhVien) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.MaNhom = MaNhom;
        this.SoSinhVien = Integer.parseInt(SoSinhVien);
    }
    private String DaoNguocNgay (String NgayThi) {
        String[] str = NgayThi.split("/");
        return str[2] + "/" +str[1] +" "+ str[0];
    }
    
    @Override
    public int compareTo(LichThi o) {
        int tmp = DaoNguocNgay(this.caThi.getNgayThi()).compareTo(DaoNguocNgay(o.caThi.getNgayThi()));
        if (tmp!=0) return tmp;
        tmp = this.caThi.getGioThi().compareTo(o.caThi.getGioThi());
        if (tmp!=0) return tmp;
        return this.caThi.getMaCT().compareTo(o.caThi.getMaCT());
        
    }

    @Override
    public String toString() {
        return  caThi + " " + monThi + " " + MaNhom + " " + SoSinhVien ;
    }
    
    
    
    
}
