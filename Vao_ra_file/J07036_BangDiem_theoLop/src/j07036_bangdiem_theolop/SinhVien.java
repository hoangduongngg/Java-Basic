/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07036_bangdiem_theolop;

import java.util.StringTokenizer;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien {
    private String MaSV , TenSV, LopSV, Email;
    
    public SinhVien() {
    }

    public SinhVien(String MaSV, String TenSV, String LopSV, String Email) {
        this.MaSV = MaSV;
        this.TenSV = ChuanHoa(TenSV);
        this.LopSV = LopSV;
        this.Email = Email;
    }
    
    
    private String ChuanHoa (String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        while (str.hasMoreTokens()) {
            String tu = str.nextToken();
            res.append(Character.toUpperCase(tu.charAt(0)));
            for (int i=1; i<tu.length(); i++) {
                res.append(Character.toLowerCase(tu.charAt(i)));
            }
            res.append(" ");
        }
        res.delete(res.length()-1, res.length());
        return res+"";
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getLopSV() {
        return LopSV;
    }

    
    @Override
    public String toString() {
        return MaSV + " " + TenSV ;
    }
    
}
