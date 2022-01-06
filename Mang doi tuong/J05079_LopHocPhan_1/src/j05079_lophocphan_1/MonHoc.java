/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05079_lophocphan_1;

/**
 *
 * @author hoangduongngg
 */
public class MonHoc implements Comparable<MonHoc>{
    private String MaMH , TenMH, NhomLop, TenGiangVien ;

    public MonHoc(String MaMH, String TenMH, String NhomLop, String TenGiangVien) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.NhomLop = NhomLop;
        this.TenGiangVien = TenGiangVien;
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    @Override
    public String toString() {
        return   NhomLop + " " + TenGiangVien ;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.NhomLop.compareTo(o.NhomLop);
    }
    
    
}
