/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_thuctap;

/**
 *
 * @author hoangduongngg
 */
public class ThucTap {
    private String MaSV, MaDN;

    public ThucTap(String Info) {
        this.MaSV = xuly_SV(Info);
        this.MaDN = xuly_DN(Info);
    }
    private String xuly_SV (String Infor) {
        String[] a = Infor.split(" ");
        return a[0];
    }
    private String xuly_DN (String Infor) {
        String[] a = Infor.split(" ");
        return a[1];
    }
    
    
    public String getMaSV() {
        return MaSV;
    }

    public String getMaDN() {
        return MaDN;
    }

    @Override
    public String toString() {
        return MaSV + " " + MaDN;
    }
    
    
}
