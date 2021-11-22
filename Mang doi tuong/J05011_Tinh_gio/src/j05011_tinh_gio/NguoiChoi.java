/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05011_tinh_gio;

/**
 *
 * @author hoangduongngg
 */
public class NguoiChoi implements Comparable<NguoiChoi>{
    private String Ma, Ten, Time;
    private Long Phut;

    public NguoiChoi(String Ma, String Ten, String GioVao, String GioRa) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Time = xuly_Time(GioVao, GioRa);
        this.Phut = xuly_Phut(GioVao, GioRa);
    }
    private String xuly_Time (String GioVao, String GioRa) {
        long phut = xuly_Phut(GioVao, GioRa);
        return phut/60 + " gio " + phut%60 + " phut" ;
    }
    private long xuly_Phut (String GioVao, String GioRa) {
        return DoiGio(GioRa) - DoiGio(GioVao);
    }
    private long DoiGio (String s) {
        String[] t = s.split(":");
        return Long.parseLong(t[0])*60 + Long.parseLong(t[1]);
    }

    @Override
    public String toString() {
        return Ma + "  " + Ten + " " + Time;
    }

    @Override
    public int compareTo(NguoiChoi o) {
        return -this.Phut.compareTo(o.Phut);
    }
}
