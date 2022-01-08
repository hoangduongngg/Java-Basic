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
public class BangDiem implements Comparable<BangDiem>{
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private String Diem, LopSV;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, String Diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.Diem = Diem;
        this.LopSV = sinhVien.getLopSV();
    }

    public String getLopSV() {
        return LopSV;
    }
    

    @Override
    public String toString() {
        return  sinhVien + " " + monHoc + " " + Diem  ;
    }

    @Override
    public int compareTo(BangDiem o) {
        int tmp = this.monHoc.getMaMH().compareTo(o.monHoc.getMaMH());
        if (tmp!=0) return tmp;
        return this.sinhVien.getMaSV().compareTo(o.sinhVien.getMaSV());
    }
    
    
}
