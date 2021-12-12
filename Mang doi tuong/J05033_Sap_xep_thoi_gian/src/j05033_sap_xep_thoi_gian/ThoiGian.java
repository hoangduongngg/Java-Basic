/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05033_sap_xep_thoi_gian;

/**
 *
 * @author hoangduongngg
 */
public class ThoiGian implements Comparable<ThoiGian>{
    private Integer Gio, Phut, Giay;

    public ThoiGian(String thoigian) {
        String[] t = thoigian.split(" ");
        this.Gio = Integer.parseInt(t[0]);
        this.Phut = Integer.parseInt(t[1]);
        this.Giay = Integer.parseInt(t[2]);
    }

    @Override
    public String toString() {
        return Gio + " " + Phut + " " + Giay;
    }

    @Override
    public int compareTo(ThoiGian o) {
        if (this.Gio!=o.Gio) return this.Gio-o.Gio;
        if (this.Phut!=o.Phut) return this.Phut-o.Phut;
        if (this.Giay!=o.Giay) return this.Giay-o.Giay;
        return 0;
    }
    
}
