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
public class SinhVien {
    private String MaSV , TenSv , LopSV;
    private Integer stt ;

    public SinhVien(Integer stt, String MaSV, String TenSv, String LopSV) {
        this.stt = stt;
        this.MaSV = MaSV;
        this.TenSv = TenSv;
        this.LopSV = LopSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public Integer getStt() {
        return stt;
    }

    public String getLopSV() {
        return LopSV;
    }
    
    

    @Override
    public String toString() {
        return MaSV + " " + TenSv + " " + LopSV;
    }
    
    
    
}
