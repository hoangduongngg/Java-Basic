/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005_Khai_bao_lop_thi_sinh;

/**
 *
 * @author hoangduongngg
 */
public class Thi_Sinh {
    private String name, DOB;
    private float diem1, diem2, diem3;
    
    

    public Thi_Sinh(String name, String DOB, float diem1, float diem2, float diem3) {
        this.name = name;
        this.DOB = DOB;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    private float tongdiem (float diem1, float diem2, float diem3) {
            return diem1+diem2+diem3;
        }
    
    @Override
    public String toString() {
        return name + " " + DOB + " "+ String.format("%.1f",tongdiem(diem1, diem2, diem3));
    }   
}
