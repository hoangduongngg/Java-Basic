/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05034_danhsach_thuctap_1;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien implements Comparable<SinhVien>{
    private int stt;
    private String MaSV, TenSV, LopSV, Email, DoanhNghiep;

    public SinhVien(int stt, String MaSV, String TenSV, String LopSV, String Email, String DoanhNghiep) {
        this.stt = stt;
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.LopSV = LopSV;
        this.Email = Email;
        this.DoanhNghiep = DoanhNghiep;
    }

    public String getDoanhNghiep() {
        return DoanhNghiep;
    }
    

    @Override
    public String toString() {
        return stt + " " + MaSV + " " + TenSV + " " + LopSV + " " + Email + " " + DoanhNghiep  ;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.TenSV.compareTo(o.TenSV);
    }
    
    
    
    
    
}
