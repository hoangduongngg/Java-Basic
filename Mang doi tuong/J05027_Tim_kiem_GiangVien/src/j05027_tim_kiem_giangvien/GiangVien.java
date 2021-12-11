/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05027_tim_kiem_giangvien;

/**
 *
 * @author hoangduongngg
 */
public class GiangVien {
    private  String Ma, Ten, BoMon;

    public GiangVien(Integer stt, String Ten, String BoMon) {
        this.Ma = xuly_Ma(stt);
        this.Ten = Ten;
        this.BoMon = xuly_BoMon(BoMon);
    }
    
    private String xuly_Ma (Integer stt) {
        if (stt<10) return "GV0" + stt;
        return "GV" +stt;
    }
    private String xuly_BoMon (String BoMon) {
        String res = "";
        String[] mon_list = BoMon.toUpperCase().split(" ");
        for (String x:mon_list) {
            res += x.charAt(0);
        }
        return res;
    }

    public String getTen() {
        return Ten;
    }

    

    @Override
    public String toString() {
        return Ma + " " + Ten + " " + BoMon  ;
    }
}
