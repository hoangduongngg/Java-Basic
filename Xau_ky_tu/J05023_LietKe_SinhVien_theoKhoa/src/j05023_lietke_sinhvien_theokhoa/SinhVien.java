/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05023_lietke_sinhvien_theokhoa;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien implements Comparable<SinhVien>{
    private String Ma, Ten, Lop, Mail, Khoa;

    public SinhVien(String Ma, String Ten, String Lop, String Mail) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Mail = Mail;
        this.Khoa = xuly_Khoa(Lop);
    }
    private String xuly_Khoa (String Lop) {
        return "" + Lop.charAt(1) + Lop.charAt(2);
    }

    public String getKhoa() {
        return Khoa;
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public String getLop() {
        return Lop;
    }

    public String getMail() {
        return Mail;
    }

    @Override
    public String toString() {
        return  Ma + " " + Ten + " " + Lop + " " + Mail ;
    }
    @Override
    public int compareTo(SinhVien o) {
        return this.Ma.compareTo(o.Ma);
    }
}
