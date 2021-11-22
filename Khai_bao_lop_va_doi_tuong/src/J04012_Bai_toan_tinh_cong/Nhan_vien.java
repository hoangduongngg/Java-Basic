package J04012_Bai_toan_tinh_cong;
/**
 *
 * @author hoangduongngg
 */
public class Nhan_vien {
    private String ID, name;
    private long tien_luong, tien_thuong, phucap, thunhap;
    public Nhan_vien() {
    }
    public Nhan_vien(String name, long luong_CB, long ngaycong, String chucvu) {
        this.ID = "NV01";
        this.name = name;
        this.tien_luong = luong_CB * ngaycong;
        this.tien_thuong = xuly_thuong(tien_luong, ngaycong);
        this.phucap = xuly_chucvu(chucvu);
        this.thunhap = tien_luong + tien_thuong + phucap;
    }
    private long xuly_thuong (long tien_luong, long ngaycong) {
        if (ngaycong>=25) {
            return tien_luong*20/100;
        }
        else if (22<=ngaycong && ngaycong<25) {
            return tien_luong*10/100;
        }
        else {
            return 0;
        }
    }
    private long xuly_chucvu (String chucvu) {
        if (chucvu.compareTo("GD")==0) {
            return 250000;
        }
        else if (chucvu.compareTo("PGD")==0) {
            return 200000;
        }
        else if (chucvu.compareTo("TP")==0) {
            return 180000;
        }
        else {
            return 150000;
        }
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + tien_luong + " " + tien_thuong + " " + phucap + " " + thunhap ;
    } 
}