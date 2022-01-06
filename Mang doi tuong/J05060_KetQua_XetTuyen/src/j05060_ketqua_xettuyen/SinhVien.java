/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05060_ketqua_xettuyen;

import java.util.Calendar;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien {
    private String MaSV , TenSV  , XepLoai, DiemTB;
    private Integer Tuoi;

    public SinhVien(Integer stt, String TenSV, String DOB, String DiemLyThuyet, String DiemThucHanh) {
        this.MaSV = xuly_MaSV(stt);
        this.TenSV = TenSV;
        this.Tuoi = xuly_Tuoi(DOB);
        this.DiemTB = xuly_DiemTB( DiemLyThuyet, DiemThucHanh);
        this.XepLoai = xuly_XepLoai(DiemTB);
    }
    private String xuly_MaSV (Integer stt) {
        return "PH" + String.format("%02d", stt);
    }
    private Integer xuly_Tuoi (String DOB) {
        String[] str = DOB.split("/");
//        Calendar cal = Calendar.getInstance();
//        return cal.get(Calendar.YEAR) - Integer.parseInt(str[2]);
        return 2021 - Integer.parseInt(str[2]);

    }
    
    private String xuly_DiemTB (String DiemLyThuyet, String DiemThucHanh) {
        Double DiemLT = Double.parseDouble(DiemLyThuyet);
        Double DiemTH = Double.parseDouble(DiemThucHanh);
        Double DiemThuong;
        if ((DiemLT-8)>=0 && (DiemTH-8)>=0) DiemThuong = 1.0;
        else if ((DiemLT-7.5)>=0 && (DiemTH-7.5)>=0) DiemThuong = 0.5;
        else DiemThuong = 0.0;
        
        Double res = (DiemLT + DiemTH)/2 + DiemThuong;
        if (res-10>0) res=10.0;
        return String.format("%.0f", res);
    }
    private String xuly_XepLoai (String DiemTB) {
        Integer Diem = Integer.parseInt(DiemTB);
        if (Diem<5) return "Truot";
        if (Diem<=6) return "Trung binh";
        if (Diem==7) return "Kha";
        if (Diem==8) return "Gioi";
        return "Xuat sac";
    }
    
    @Override
    public String toString() {
        return MaSV + " " + TenSV + " " + Tuoi + " " + DiemTB  +" " + XepLoai;
    }
}
