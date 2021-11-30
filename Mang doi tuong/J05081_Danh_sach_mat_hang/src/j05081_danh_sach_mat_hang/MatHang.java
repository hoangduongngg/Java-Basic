/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05081_danh_sach_mat_hang;

/**
 *
 * @author hoangduongngg
 */
public class MatHang implements Comparable<MatHang>{
    private String Ma, Ten, DonVi;
    private Integer GiaMua, GiaBan, LoiNhuan;

    public MatHang(Integer stt, String Ten, String DonVi, String GiaMua, String GiaBan) {
        this.Ma = xuly_ma(stt);
        this.Ten = Ten;
        this.DonVi = DonVi;
        this.GiaMua = Integer.parseInt(GiaMua);
        this.GiaBan = Integer.parseInt(GiaBan);
        this.LoiNhuan = this.GiaBan - this.GiaMua;
    }
    
    private String xuly_ma (Integer stt) {
        if (stt<10) return "MH00" + stt;
        return "MH0" + stt;
    }

    @Override
    public String toString() {
        return Ma + " " + Ten + " " + DonVi + " " + GiaMua + " " + GiaBan + " " + LoiNhuan;
    }
    
    @Override
    public int compareTo(MatHang o) {
        int x = this.LoiNhuan - o.LoiNhuan;
        if ( x==0) return this.Ma.compareTo(o.Ma);
        else return -(int) x;
    }
    
}
