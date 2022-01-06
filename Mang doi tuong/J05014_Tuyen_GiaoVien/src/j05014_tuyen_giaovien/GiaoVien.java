/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05014_tuyen_giaovien;

/**
 *
 * @author hoangduongngg
 */
public class GiaoVien implements Comparable<GiaoVien>{
    private String MaGV , TenGV , TenMH, KetQua;
    private Double TongDiem ;

    public GiaoVien(Integer stt, String TenGV, String MaXetTuyen, String DiemTinHoc, String DiemChuyenMon) {
        this.MaGV = "GV" + String.format("%02d", stt);
        this.TenGV = TenGV;
        this.TenMH = xuly_TenMH(MaXetTuyen);
        this.TongDiem = xuly_TongDiem(MaXetTuyen, DiemTinHoc, DiemChuyenMon);
        this.KetQua = xuly_KetQua(TongDiem);
    }
    
    private String xuly_TenMH (String MaXetTuyen) {
        if (MaXetTuyen.charAt(0)=='A') return "TOAN";
        if (MaXetTuyen.charAt(0)=='B') return "LY";
        return "HOA";
    }
    private Double xuly_TongDiem (String MaXetTuyen, String DiemTinHoc, String DiemChuyenMon) {
        Double DiemUuTien;
        if (MaXetTuyen.charAt(1)=='1') DiemUuTien=2.0;
        else if (MaXetTuyen.charAt(1)=='2') DiemUuTien=1.5;
        else if (MaXetTuyen.charAt(1)=='3') DiemUuTien=1.0;
        else DiemUuTien = 0.0;
        
        return DiemUuTien + Double.parseDouble(DiemTinHoc)*2 + Double.parseDouble(DiemChuyenMon);
    }
    
    private String xuly_KetQua (Double TongDiem) {
        if (TongDiem-18>=0) return "TRUNG TUYEN";
        return "LOAI";
    }

    @Override
    public String toString() {
        return MaGV + " " + TenGV + " " + TenMH  + " " + String.format("%.1f", TongDiem) + " " + KetQua ;
    }

    @Override
    public int compareTo(GiaoVien o) {
        int res = (int) (this.TongDiem-o.TongDiem);
//        if (res == 0) return o.MaGV.compareTo(this.MaGV);
        return  -res;
    }
    
    
}
