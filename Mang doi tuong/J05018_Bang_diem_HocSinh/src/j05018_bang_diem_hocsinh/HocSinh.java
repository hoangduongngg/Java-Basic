/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05018_bang_diem_hocsinh;

/**
 *
 * @author hoangduongngg
 */
public class HocSinh implements Comparable<HocSinh>{
    private String Ma, Ten, XepLoai;
    private Double Diemtb;
    private Integer stt;

    public HocSinh(Integer stt, String Ten, String Diem) {
        this.stt = stt;
        this.Ma = xuly_Ma(stt);
        this.Ten = Ten;
        this.Diemtb = xuly_Diemtb(Diem);
        this.XepLoai = xuly_XepLoai(Diemtb);
    }
    private String xuly_Ma (Integer stt) {
        if (stt<10) return "HS0" +stt;
        return "HS" + stt;
    }
    
    private Double xuly_Diemtb (String Diem) {
        String[] a = Diem.split("\\s+");
        Double toan = Double.parseDouble(a[0]);
        Double van = Double.parseDouble(a[1]);
        Double sum = toan + van;
        for (String x:a) {
            sum += Double.parseDouble(x);
        }
        Double res = sum/12;
        return (double) Math.round(res*10)/10;
    }
    private String xuly_XepLoai (Double Diemtb) {
        if (Diemtb >= 9) return "XUAT SAC";
        if (Diemtb >= 8) return "GIOI";
        if (Diemtb >= 7) return "KHA";
        if (Diemtb >= 5) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return Ma + " " + Ten + " " + String.format("%.1f", Diemtb) + " " + XepLoai;
    }

    @Override
    public int compareTo(HocSinh o) {
        if (o.Diemtb - this.Diemtb > 0) return 1;
        else if ((o.Diemtb - this.Diemtb < 0))return -1;
        return this.stt - o.stt;
    }
}


