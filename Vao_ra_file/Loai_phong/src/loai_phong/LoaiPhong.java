/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loai_phong;

/**
 *
 * @author hoangduongngg
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String Loai, TenLoai;
    private int DonGia;
    private float PhiPhucVu;

    public LoaiPhong () {
        
    }
    public LoaiPhong(String LoaiPhongString) {
        String[] s = LoaiPhongString.split(" ");
        
        this.Loai = s[0];
        this.TenLoai = s[1];
        this.DonGia = Integer.parseInt(s[2]);
        this.PhiPhucVu = Float.parseFloat(s[3]);
    }

    @Override
    public String toString() {
        return Loai + " " + TenLoai + " " + DonGia + " " + PhiPhucVu;
    }
    @Override
    public int compareTo (LoaiPhong o) {
        return this.TenLoai.compareTo(o.TenLoai);
    }
}
