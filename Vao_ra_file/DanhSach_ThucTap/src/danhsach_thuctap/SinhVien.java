/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_thuctap;
import java.util.*;
/**
 *
 * @author hoangduongngg
 */
public class SinhVien {
    private String Ma, Ten, Lop, Mail;

    public SinhVien(String Ma, String Ten, String Lop, String Mail) {
        this.Ma = Ma;
        this.Ten = ChuanHoa(Ten);
        this.Lop = Lop;
        this.Mail = Mail;
    }
    
    private String ChuanHoa(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i=1; i<tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        
        return "" + res;
        
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
        return Ma + " " + Ten + " " + Lop + " " + Mail;
    }
    
    
}
