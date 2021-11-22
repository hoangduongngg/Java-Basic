package danh_sach_san_pham_2;

public class SanPham implements Comparable<SanPham>{
    private String MaSP, TenSP;
    private Integer GiaSP, ThoiHan;

    public SanPham(String MaSP, String TenSP, String GiaSP, String ThoiHan) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaSP = Integer.parseInt(GiaSP);
        this.ThoiHan = Integer.parseInt(ThoiHan);
    }

    @Override
    public String toString() {
        return MaSP + " " + TenSP + " " + GiaSP + " " + ThoiHan ;
    }

    @Override
    public int compareTo(SanPham o) {
        int res = (int) this.GiaSP - o.GiaSP;
        if (res==0) return this.MaSP.compareTo(o.MaSP);
        return -res;
    }
}
