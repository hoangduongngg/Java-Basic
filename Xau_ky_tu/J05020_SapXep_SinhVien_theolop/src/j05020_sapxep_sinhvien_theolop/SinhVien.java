/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05020_sapxep_sinhvien_theolop;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien implements Comparable<SinhVien>{
    private String Ma, Ten, Lop, Mail;

    public SinhVien(String Ma, String ten, String Lop, String Mail) {
        this.Ma = Ma;
        this.Ten = ten;
        this.Lop = Lop;
        this.Mail = Mail;
    }

    @Override
    public String toString() {
        return  Ma + " " + Ten + " " + Lop + " " + Mail ;
    }
    @Override
    public int compareTo(SinhVien o) {
        if (this.Lop.compareTo(o.Lop) == 0) return this.Ma.compareTo(o.Ma);
        return this.Lop.compareTo(o.Lop);
    }
    
}
