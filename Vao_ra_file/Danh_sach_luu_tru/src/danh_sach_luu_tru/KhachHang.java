package danh_sach_luu_tru;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author hoangduongngg
 */
public class KhachHang implements Comparable <KhachHang>{
    private String MaKH, TenKH, MaPhong;
    private long SoNgay;

    public KhachHang(int STT, String TenKH, String MaPhong, String NgayDen, String NgayDi) {
        this.MaKH = xuly_STT(STT);
        this.TenKH = TenKH;
        this.MaPhong = MaPhong;
        this.SoNgay = xuly_SoNgay(NgayDen, NgayDi);
    }
    
    private String xuly_STT (int STT) {
        if (STT<10) return "KH0" + STT;
        return "KH" + STT;
    }
    private long xuly_SoNgay(String NgayDen, String NgayDi) {
        return DoiNgay(NgayDi) - DoiNgay(NgayDen) ;
    }
    private long DoiNgay (String Day) {
        String[] d = Day.split("/");
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(d[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(d[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(d[2]));
        
        Date FirstDay = cal.getTime();
        return FirstDay.getTime()/ 1000 / 60 / 60 / 24;
    }

    @Override
    public String toString() {
        return MaKH + " " + TenKH + " " + MaPhong + " " + SoNgay ;
    }

    @Override
    public int compareTo(KhachHang o) {
        return (int)(o.SoNgay - this.SoNgay);
    }
}