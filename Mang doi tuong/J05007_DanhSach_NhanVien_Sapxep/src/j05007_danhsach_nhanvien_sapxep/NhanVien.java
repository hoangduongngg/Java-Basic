/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05007_danhsach_nhanvien_sapxep;

/**
 *
 * @author hoangduongngg
 */
public class NhanVien implements Comparable<NhanVien>{
    private String Ma, Name,Gender, DOB, Add, MaThue, NgayKiHopDong;

    public NhanVien(Integer stt, String Ten, String Gender, String DOB, String Add, String MaThue, String NgayKiHopDong) {
        this.Ma = xuly_Ma(stt);
        this.Name = Ten;
        this.Gender = Gender;
        this.DOB = DOB;
        this.Add = Add;
        this.MaThue = MaThue;
        this.NgayKiHopDong = NgayKiHopDong;
    }
    
    private String xuly_Ma (Integer stt) {
        if (stt<10) return "0000" + stt;
        return "000" +stt;
    }
    @Override
    public String toString() {
        return Ma + " " + Name + " "+ Gender + " "+ DOB + " " + Add + " " + MaThue + " " + NgayKiHopDong;
    }

    @Override
    public int compareTo(NhanVien o) {
        String[] a = this.DOB.split("/");
        String[] b = o.DOB.split("/");
        for (int i=2; i>=0; i--) {
            if (a[i].compareTo(b[i]) != 0) {
                return a[i].compareTo(b[i]);
            }
        }
        return 0;
    }
}
