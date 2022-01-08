/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07027_quanly_btnhom;

/**
 *
 * @author hoangduongngg
 */
public class Nhom implements Comparable<Nhom>{
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(SinhVien sinhVien, BaiTap baiTap) {
        this.sinhVien = sinhVien;
        this.baiTap = baiTap;
    }

    @Override
    public String toString() {
        return  sinhVien + " " + baiTap ;
    }

    @Override
    public int compareTo(Nhom o) {
        return this.sinhVien.getMaSV().compareTo(o.sinhVien.getMaSV());
    }
    
    
    
}
