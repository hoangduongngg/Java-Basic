/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05075_diemdanh_2;

/**
 *
 * @author hoangduongngg
 */
public class DiemDanh implements Comparable<DiemDanh>{
    private SinhVien sinhVien;
    private Integer DiemCC, stt;
    private String GhiChu, LopSV ;

    public DiemDanh(SinhVien sinhVien, String ChuyenCan, Integer stt) {
        this.sinhVien = sinhVien;
        this.DiemCC = xuly_DiemCC(ChuyenCan);
        this.GhiChu = xuly_GhiChu(DiemCC);
        this.stt = stt ;
    }
    
    private Integer xuly_DiemCC (String ChuyenCan) {
        int res=10;
        for (int i=0; i<ChuyenCan.length(); i++) {
            if (ChuyenCan.charAt(i)=='v') res-=2;
            else if (ChuyenCan.charAt(i)=='m') res--;
            else continue;
        }
        if (res<0) res=0;
        return res;
    }

    public String getLopSV() {
        return sinhVien.getLopSV();
    }
    
    
    
    private String xuly_GhiChu (Integer DiemCC) {
        if (DiemCC==0) return "KDDK";
        return "";
    }

    @Override
    public String toString() {
        return sinhVien + " " + DiemCC + " " + GhiChu ;
    }

    @Override
    public int compareTo(DiemDanh o) {
        return this.stt-o.stt;
    }
    
    
}

