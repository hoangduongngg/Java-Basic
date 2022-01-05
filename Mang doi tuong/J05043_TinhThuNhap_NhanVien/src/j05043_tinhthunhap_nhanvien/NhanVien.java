/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05043_tinhthunhap_nhanvien;

/**
 *
 * @author hoangduongngg
 */
public class NhanVien {
    private String MaNV, TenNV;
    private Integer PhuCap, LuongChinh, LuongTamUng, LuongConLai;

    public NhanVien(Integer stt, String TenNV, String ChucVu, String LuongCoBan, String SoNgayCong) {
        this.MaNV = xuly_MaNV(stt);
        this.TenNV = TenNV;
        this.PhuCap = xuly_PhuCap(ChucVu);
        this.LuongChinh = xuly_LuongChinh(LuongCoBan, SoNgayCong);
        this.LuongTamUng = xuly_LuongTamUng(LuongChinh, PhuCap);
        this.LuongConLai = xuly_LuongConLai(LuongChinh, LuongTamUng, PhuCap);
    }
    private String xuly_MaNV (Integer stt) {
        if (stt<10) return "NV0" + stt;
        return "NV" + stt;
    }
    private Integer xuly_PhuCap (String ChucVu) {
        if (ChucVu.compareTo("GD")==0) {
            return 500;
        }
        if (ChucVu.compareTo("PGD")==0) {
            return 400;
        }
        if (ChucVu.compareTo("TP")==0) {
            return 300;
        }
        if (ChucVu.compareTo("KT")==0) {
            return 250;
        }
        return 100;
    }
    private Integer xuly_LuongChinh (String LuongCoBan, String SoNgayCong) {
        return Integer.parseInt(LuongCoBan)*Integer.parseInt(SoNgayCong);
    }
    private Integer xuly_LuongTamUng (Integer LuongChinh, Integer PhuCap) {
        Integer tmp = (PhuCap + LuongChinh)*2/3;
        if (tmp<25000) {
            int roundNumber = (tmp+500)/1000*1000;
            return roundNumber;
        }
        return 25000;
    }
    private Integer xuly_LuongConLai ( Integer LuongChinh, Integer LuongTamUng, Integer PhuCap) {
        return LuongChinh - LuongTamUng + PhuCap;
    }

    @Override
    public String toString() {
        return MaNV + " " + TenNV + " " + PhuCap + " " + LuongChinh + " " + LuongTamUng + " " + LuongConLai ;
    }
    
    
    
    
    
}
