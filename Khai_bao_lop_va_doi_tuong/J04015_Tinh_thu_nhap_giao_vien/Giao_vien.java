package J04015_Tinh_thu_nhap_giao_vien;

/**
 *
 * @author hoangduongngg
 */
public class Giao_vien {
    private String ID, name;
    private int bac_luong, phucap;
    private long thunhap;
    public Giao_vien() {
    }

    public Giao_vien(String ID, String name, int luong_cb) {
        this.ID = ID;
        this.name = name;
        this.bac_luong = xuly_bacluong(ID);
        this.phucap = xuly_phucap(ID);
        this.thunhap = xuly_thunhap(luong_cb, bac_luong, phucap);
    }
    
    private int xuly_bacluong(String ID) {
        return Integer.valueOf("" + ID.charAt(2))*10 + Integer.valueOf("" + ID.charAt(3)) ;
    }
    
    private int xuly_phucap(String ID) {
        String chucvu = "" + ID.charAt(0) + ID.charAt(1);
        if (chucvu.compareTo("HT")==0) {
            return 2000000;
        }
        else if (chucvu.compareTo("HP")==0) {
            return 900000;
        }
        else {
            return 500000;
        }
    }
    private long xuly_thunhap(int luong_cb, int bac_luong, int phucap) {
        return luong_cb*bac_luong + phucap;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + bac_luong + " " + phucap + " " + thunhap;
    }
    
}
