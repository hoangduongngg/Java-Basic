/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007_Khai_bao_lop_nhan_vien;

/**
 *
 * @author hoangduongngg
 */
public class NhanVien {
    private String ID, name, gender, DOB, address, ma_thue, ngay_ky;

    public NhanVien(String name, String gender, String DOB, String address, String ma_thue, String ngay_ky) {
        ID = "00001";
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.address = address;
        this.ma_thue = ma_thue;
        this.ngay_ky = ngay_ky;
    }
    

    @Override
    public String toString() {
        return ID + " " + name + " " + gender + " " + DOB + " " + address + " " + ma_thue + " " + ngay_ky;
    }
    
    
}
