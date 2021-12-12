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
public class MonHoc {
    private String MaMonHoc, TenMonThi, HinhThuc;

    public MonHoc(String MaMonHoc, String TenMonThi, String HinhThuc) {
        this.MaMonHoc = MaMonHoc;
        this.TenMonThi = TenMonThi;
        this.HinhThuc = HinhThuc;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public String getTenMonThi() {
        return TenMonThi;
    }
    
}
