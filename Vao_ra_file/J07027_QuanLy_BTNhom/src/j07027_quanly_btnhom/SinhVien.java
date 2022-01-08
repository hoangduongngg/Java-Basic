
package j07027_quanly_btnhom;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien {
    private String MaSV, TenSV, PhoneSV;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String TenSV, String PhoneSV) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.PhoneSV = PhoneSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    
    @Override
    public String toString() {
        return MaSV + " " + TenSV + " " + PhoneSV ;
    }  
}
