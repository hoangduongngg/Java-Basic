/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_lichthi;

/**
 *
 * @author hoangduongngg
 */
public class CaThi{
    private String MaCaThi, NgayThi, GioThi, PhongThi ;

    public CaThi(Integer stt, String NgayThi, String GioThi, String PhongThi) {
        this.MaCaThi = xuly_stt(stt);
        this.NgayThi = NgayThi;
        this.GioThi = GioThi;
        this.PhongThi = PhongThi;
    }
    private String xuly_stt (Integer stt) {
        if (stt<10) return "C00"+stt;
        if (stt<100) return "C0" +stt;
        return "C" + stt;
    }

    public String getMaCaThi() {
        return MaCaThi;
    }

    public String getNgayThi() {
        return NgayThi;
    }

    public String getGioThi() {
        return GioThi;
    }

    public String getPhongThi() {
        return PhongThi;
    }
}
