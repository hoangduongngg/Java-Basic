/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003_Phan_So;

/**
 *
 * @author hoangduongngg
 */
public class PhanSo {
    private long tu, mau;
    
    public PhanSo (long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    private long gcd (long a, long b) {
        while (b>0) {
            long t = a%b;
            a = b;
            b = t;  
        }
        return a;
    }

    public void rutgon () {
        long a=gcd(tu,mau);
        tu /=a;
        mau/=a;
    }
  
}
