/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07027_quanly_btnhom;

/**
 *
 * @author hoangduongngg
 */
public class BaiTap {
    private Integer Nhom ;
    private String TenBT ;

    public BaiTap() {
    }

    public BaiTap(Integer stt, String TenBT) {
        this.Nhom = stt;
        this.TenBT = TenBT;
    }

    public Integer getNhom() {
        return Nhom;
    }

    @Override
    public String toString() {
        return  Nhom + " " + TenBT ;
    }
    
    
}
