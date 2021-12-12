/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_monthi;

/**
 *
 * @author hoangduongngg
 */
public class MonHoc implements Comparable<MonHoc>{
    private String Ma, Ten, HinhThuc;

    public MonHoc(String Ma, String Ten, String HinhThuc) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.HinhThuc = HinhThuc;
    }

    @Override
    public String toString() {
        return Ma + " " + Ten + " " + HinhThuc ;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.Ma.compareTo(o.Ma);
    }
    
    
}
