/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05024_lietke_sinhvien_theonganh;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien  {
    private String Ma, Ten, Lop, Mail, Nganh;

    public SinhVien(String Ma, String Ten, String Lop, String Mail) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Mail = Mail;
        this.Nganh = xuly_Nganh(Lop, Ma);
    }
    private String xuly_Nganh (String Lop, String Ma) {
        String a = "" + Lop.charAt(0);
        if (a.compareTo("E")==0)
            return "E";
        else return "" + Ma.charAt(5) + Ma.charAt(6);
    }

    public String getNganh() {
        return Nganh;
    }
    
    @Override
    public String toString() {
        return  Ma + " " + Ten + " " + Lop + " " + Mail ;
    }
}
