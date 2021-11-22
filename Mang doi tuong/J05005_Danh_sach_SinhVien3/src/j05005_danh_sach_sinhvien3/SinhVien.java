/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05005_danh_sach_sinhvien3;

import java.util.StringTokenizer;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien implements Comparable<SinhVien>{
    private String MaSV, TenSV, LopSV, DOB;
    private Double gpa;

    public SinhVien(Integer stt, String TenSV, String LopSV, String DOB, String gpa) {
        this.MaSV = xuly_MaSV(stt);
        this.TenSV = ChuanHoaTen(TenSV);
        this.LopSV = LopSV;
        this.DOB = xuly_Day(DOB);
        this.gpa = Double.parseDouble(gpa);
    }
    private String xuly_MaSV (Integer stt) {
        if (stt<10) return "B20DCCN00"+ stt;
        if (stt<100) return "B20DCCN0" + stt;
        return "B20DCCN" + stt;
    }
    
    private String ChuanHoaTen (String s) {
        StringBuffer res = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i=1; i<tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
    private String xuly_Day (String DOB) {
        String[] s = DOB.split("/");
        if (s[0].length() == 1) s[0]= "0" + s[0];
        if (s[1].length() == 1) s[1]= "0" + s[1];
        return s[0] + "/" + s[1] + "/" + s[2];
    }

    @Override
    public String toString() {
        return MaSV + " " + TenSV + " " + LopSV + " " + DOB + " " + String.format("%.2f", gpa) ;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.gpa < o.gpa) return 1;
        else if (this.gpa > o.gpa)return -1;
        return 0;
    }
}
